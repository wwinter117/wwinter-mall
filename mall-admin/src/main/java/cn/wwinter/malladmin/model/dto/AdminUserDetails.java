package cn.wwinter.malladmin.model.dto;

import cn.wwinter.entity.UmsAdmin;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serial;
import java.util.Collection;
import java.util.List;

/**
 * ClassName: AdminUserDetails
 * Package: cn.wwinter.malldemo.model.dto
 * Description: SpringSecurity需要的用户详情
 * Datetime: 2023/11/26
 * Author: zhangdd
 */
@AllArgsConstructor
public class AdminUserDetails implements UserDetails {

    @Serial
    private static final long serialVersionUID = 7308709517059008547L;

    private final UmsAdmin umsAdmin;

    private final List<String> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return AuthorityUtils.createAuthorityList(roles);
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
