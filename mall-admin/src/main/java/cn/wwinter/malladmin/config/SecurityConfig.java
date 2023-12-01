package cn.wwinter.malladmin.config;

import cn.wwinter.malladmin.filter.JwtAuthenticationTokenFilter;
import cn.wwinter.malladmin.model.dto.AdminUserDetails;
import cn.wwinter.malladmin.service.AdminService;
import cn.wwinter.mapper.UmsAdminMapper;
import cn.wwinter.model.UmsAdmin;
import cn.wwinter.model.UmsAdminExample;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.util.List;

/**
 * ClassName: SecurityConfig
 * Package: cn.wwinter.malldemo.model.config
 * Description:
 * Datetime: 2023/11/26
 * Author: zhangdd
 */
@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class SecurityConfig {
    private final UmsAdminMapper adminMapper;
    /**
     * 白名单
     */
    private final static String[] WHITELIST = {
            "/v3/api-docs/**",
            "/swagger-ui/**",
            "/admin/**",
            "/swagger-resources/**",
            "/v2/api-docs/**",
            "/*.html",
            "/*/*.html",
            "/*/*.css",
            "/*/*.js",
    };

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http, JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter) throws Exception {
        http
                .cors(AbstractHttpConfigurer::disable)
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(authorize -> {
                    authorize
                            .requestMatchers(WHITELIST).permitAll()
                            .anyRequest().authenticated();
                })
                .httpBasic(AbstractHttpConfigurer::disable)
                .formLogin(form -> form.loginPage("/index.html").permitAll());
        http.addFilterBefore(jwtAuthenticationTokenFilter, UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                UmsAdminExample example = new UmsAdminExample();
                example.createCriteria().andUsernameEqualTo(username);
                List<UmsAdmin> umsAdmins = adminMapper.selectByExample(example);
                UmsAdmin admin = null;
                if (umsAdmins != null && !umsAdmins.isEmpty() && username.equals((admin = umsAdmins.get(0)).getUsername())) {
                    return new AdminUserDetails(admin);
                }
                throw new UsernameNotFoundException("用户名或密码错误");
            }
        };
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception {
        return http.getSharedObject(AuthenticationManagerBuilder.class)
                .build();
    }
}
