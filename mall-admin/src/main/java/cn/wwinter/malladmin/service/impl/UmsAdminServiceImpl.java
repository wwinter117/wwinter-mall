package cn.wwinter.malladmin.service.impl;

import cn.wwinter.malladmin.service.action.sqlAction.UmsAdminSqlAction;
import cn.wwinter.malladmin.model.common.CommonResponse;
import cn.wwinter.malladmin.model.dto.UmsAdminDto;
import cn.wwinter.entity.UmsAdmin;
import cn.wwinter.entity.UmsAdminRole;
import cn.wwinter.malladmin.service.UmsAdminService;
import cn.wwinter.malladmin.util.JwtTokenUtil;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: UmsAdminServiceImpl
 * Package: cn.wwinter.malladmin.service.impl
 * Description:
 * Datetime: 2023/12/1
 * Author: zhangdd
 */
@Service
@AllArgsConstructor
public class UmsAdminServiceImpl implements UmsAdminService {
    private final UmsAdminSqlAction umsAdminSqlAction;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final UserDetailsService userDetailsService;
    private final JwtTokenUtil jwtTokenUtil;
    private static final Logger LOGGER = LoggerFactory.getLogger(UmsAdminServiceImpl.class);

    @Override
    public CommonResponse register(UmsAdminDto adminDto) {
        List<UmsAdmin> umsAdmins = umsAdminSqlAction.selectByUsername(adminDto.getUsername());
        if (!CollectionUtils.isEmpty(umsAdmins)) {
            return CommonResponse.failed("注册失败: 用户名已存在");
        }
        UmsAdmin umsAdmin = new UmsAdmin();
        BeanUtils.copyProperties(adminDto, umsAdmin);
        // 加密存储，加盐
        String encodePassword = passwordEncoder.encode(umsAdmin.getPassword());
        umsAdmin.setPassword(encodePassword);
        umsAdminSqlAction.insertIterm(umsAdmin);

        // 插入用户角色关联信息表
        List<UmsAdminRole> umsAdminRoleList = new ArrayList<>();
        List<String> roles = adminDto.getRoles();
        for (String role : roles) {
            UmsAdminRole umsAdminRole = new UmsAdminRole();
            umsAdminRole.setUmsAdminId(umsAdmin.getId());
            umsAdminRole.setUmsRoleId(umsAdminSqlAction.selectByRoleName(role).getId());
            umsAdminRoleList.add(umsAdminRole);
        }
        umsAdminSqlAction.insertRoleList(umsAdminRoleList);

        return CommonResponse.success("");
    }

    @Override
    public CommonResponse login(String username, String password) {
        try {
                UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username, password);
            Authentication authenticate = authenticationManager.authenticate(authenticationToken);
            SecurityContextHolder.getContext().setAuthentication(authenticate);
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            String token = jwtTokenUtil.generateToken(userDetails);
            LOGGER.info("用户: {} 登录成功！返回token: {}", username, token);
            return CommonResponse.success(token);
        } catch (AuthenticationException e) {
            LOGGER.error("登录异常: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

}
