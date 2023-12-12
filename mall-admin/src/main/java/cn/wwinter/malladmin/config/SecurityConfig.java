package cn.wwinter.malladmin.config;

import cn.wwinter.malladmin.service.action.sqlAction.admin.UmsAdminSqlAction;
import cn.wwinter.malladmin.model.enums.Roles;
import cn.wwinter.malladmin.filter.JwtAuthenticationTokenFilter;
import cn.wwinter.malladmin.model.dto.AdminUserDetails;
import cn.wwinter.malladmin.model.domain.UmsAdmin;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.util.CollectionUtils;

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
    private final UmsAdminSqlAction umsAdminSqlAction;
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
            "/*/*.js"
    };

    /**
     * SecurityFilterChain
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http, JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter) throws Exception {
        http
                .cors(AbstractHttpConfigurer::disable)
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(authorize -> {
                    authorize
                            .requestMatchers(WHITELIST).permitAll()
                            .requestMatchers("/brand/listAll").hasRole(Roles.ADMIN.getValue())
                            .requestMatchers("/brand/list").hasRole(Roles.USER.getValue())
                            .anyRequest().authenticated();
                })
                .httpBasic(AbstractHttpConfigurer::disable);
//                .formLogin(form -> form.loginPage("/index.html").permitAll());
        http.addFilterBefore(jwtAuthenticationTokenFilter, UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }

    /**
     * UserDetailsService
     */
    @Bean
    public UserDetailsService userDetailsService() {
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                List<UmsAdmin> umsAdmins = umsAdminSqlAction.selectByUsername(username);
                if (!CollectionUtils.isEmpty(umsAdmins)) {
                    UmsAdmin umsAdmin = umsAdmins.get(0);
                    List<String> roles = umsAdminSqlAction.selectUmsAdminRole(umsAdmin.getId());
                    return new AdminUserDetails(umsAdmin, roles);
                }
                throw new UsernameNotFoundException("用户名不存在");
            }
        };
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception {
        return http.getSharedObject(AuthenticationManagerBuilder.class)
                .build();
    }
}
