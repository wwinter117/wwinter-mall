package cn.wwinter.malladmin.model.dto.admin;

import cn.wwinter.malladmin.model.entity.admin.UmsAdmin;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serial;
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

    @Serial
    private static final long serialVersionUID = 7308709517059008547L;

    private final UmsAdmin umsAdmin;

    private static final Collection<GrantedAuthority> ROLE_TEST =
            Collections.unmodifiableList(AuthorityUtils.createAuthorityList("TEST"));

    public AdminUserDetails(UmsAdmin umsAdmin) {
        this.umsAdmin = umsAdmin;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
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
