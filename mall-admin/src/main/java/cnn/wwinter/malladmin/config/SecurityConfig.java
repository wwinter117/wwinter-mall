package cnn.wwinter.malladmin.config;

import cn.wwinter.mapper.UmsAdminMapper;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

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

    private final UmsAdminMapper umsAdminMapper;
    /**
     * 白名单
     */
    private final static String[] WHITELIST = {
            "/demo/brand/**",
            "/v3/api-docs/**",
            "/swagger-ui/**",
            "*"
    };

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .cors(AbstractHttpConfigurer::disable)
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(authorize -> {
                    authorize
                            .requestMatchers(WHITELIST).permitAll()
                            .anyRequest().authenticated();
                })
                .httpBasic(AbstractHttpConfigurer::disable)
                .formLogin(form -> form.loginPage("/login").permitAll());
        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("root")
                .password("root")
                .roles("ROOT")
                .build();
        return new InMemoryUserDetailsManager(user);
    }

//    @Bean
//    public UserDetailsService userDetailsService() {
//        return new UserDetailsService() {
//            @Override
//            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//                UmsAdmin user = new UmsAdmin();
//                user.setUsername("root");
//                user.setEmail("root@gmail.com");
//                user.setPassword("root");
//                if (username.equals(user.getUsername())) {
//                    return new AdminUserDetails(user);
//                }
//                throw new UsernameNotFoundException("用户名或密码错误");
//            }
//        };
//    }
}
