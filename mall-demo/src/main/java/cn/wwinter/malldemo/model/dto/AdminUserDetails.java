package cn.wwinter.malldemo.model.dto;

import cn.wwinter.model.UmsAdmin;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

/**
 * ClassName: AdminUserDetails
 * Package: cn.wwinter.malldemo.model.dto
 * Description: SpringSecurity需要的用户详情
 * Datetime: 2023/11/26
 * Author: zhangdd
 */
public class AdminUserDetails implements UserDetails {

    private final UmsAdmin umsAdmin;

    private static final Collection<GrantedAuthority> ROLE_TEST =
            Collections.unmodifiableList(AuthorityUtils.createAuthorityList("TEST"));

    public AdminUserDetails(UmsAdmin umsAdmin) {
        this.umsAdmin = umsAdmin;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // 返回当前用户的权限
        return ROLE_TEST;
    }


    @Override
    public String getPassword() {
        return umsAdmin.getPassword();
    }

    @Override
    public String getUsername() {
        return umsAdmin.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
