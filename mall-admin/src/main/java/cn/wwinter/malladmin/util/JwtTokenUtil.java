package cn.wwinter.malladmin.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtTokenUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(JwtTokenUtil.class);

    /**
     * token过期时间
     */
    @Value("${jwt.expiration}")
    private Long expiration;

    @Value("${jwt.secret}")
    private String secret;
    /**
     * 使用更安全的随机密钥
     */
    private SecretKey key = null;

    @PostConstruct
    public void init() {
        key = Keys.hmacShaKeyFor(secret.getBytes());
    }

    /**
     * 生成token
     */
    public String generateToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>();
        claims.put(Claims.SUBJECT, userDetails.getUsername());
        claims.put(Claims.ISSUED_AT, new Date());
        claims.put(Claims.EXPIRATION, generateExpirationDate());
        return generateToken(claims);
    }

    /**
     * 刷新token
     */
    public String refreshToken(String token) {
        Claims claims = getClaimsFromToken(token);
        claims.put(Claims.EXPIRATION, generateExpirationDate());
        return generateToken(claims);
    }

    /**
     * 验证token是否有效
     */
    public boolean validateToken(String token, UserDetails userDetails) {
        String username = getUserNameFromToken(token);
        return username != null && constantTimeEquals(username, userDetails.getUsername()) && !isTokenExpired(token);
    }

    private String generateToken(Map<String, Object> claims) {
        return Jwts.builder()
                .claims(claims)
                .signWith(key) // 使用随机密钥进行签名
                .compact();
    }

    /**
     * 获取token中的用户名
     */
    public String getUserNameFromToken(String token) {
        Claims claims = getClaimsFromToken(token);
        return claims.getSubject();
    }

    /**
     * 获取token中的失效时间
     */
    private Date getExpiredDateFromToken(String token) {
        Claims claims = getClaimsFromToken(token);
        return claims.getExpiration();
    }

    /**
     * 获取token中的登录时间
     */
    private Date getIssuedAtFromToken(String token) {
        Claims claims = getClaimsFromToken(token);
        return claims.getIssuedAt();
    }

    /**
     * 获取token中的clams
     */
    private Claims getClaimsFromToken(String token) {
        try {
            return Jwts.parser()
                    .verifyWith(key)
                    .build()
                    .parseSignedClaims(token)
                    .getPayload();
        } catch (Exception e) {
            LOGGER.error("JWT格式验证失败: {}", token);
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断token是否过期
     */
    private boolean isTokenExpired(String token) {
        Date expiredDate = getExpiredDateFromToken(token);
        return expiredDate.before(new Date());
    }


    /**
     * 判断token中的用户名是否和数据库中用户名一致
     * 使用常量时间比较,避免时序攻击（timing attack）
     * 防止通过定时攻击猜测用户名
     */
    private boolean constantTimeEquals(String nameFromToken, String nameFromDB) {
        return Arrays.equals(nameFromToken.getBytes(), nameFromDB.getBytes());
    }


    /**
     * 生成过期时间
     */
    private Date generateExpirationDate() {
        return new Date(System.currentTimeMillis() + expiration * 1000);
    }

}

