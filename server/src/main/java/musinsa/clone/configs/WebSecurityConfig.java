package musinsa.clone.configs;

import lombok.RequiredArgsConstructor;
import musinsa.clone.domain.member.MemberService;
import musinsa.clone.utils.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.security.SecureRandom;

@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Configuration
    public static class AdminSecurityConfig extends WebSecurityConfigurerAdapter {
        @Autowired
        private PasswordEncoder passwordEncoder;

        @Autowired
        private MemberService memberService;


        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                    .csrf().disable()
                    .antMatcher("/admin/**").authorizeRequests()
                    .antMatchers("/admin/member/signIn").permitAll()
                    .antMatchers("/admin/**").hasRole("ADMIN")
                    .antMatchers("/resources/**").permitAll()
            .and()
                    .formLogin()
                        .usernameParameter("id")
                        .passwordParameter("password")
                        .loginProcessingUrl("/admin/member/signIn")
                        .defaultSuccessUrl("/admin/member/list")
                        .loginPage("/admin/member/signIn")
            .and()
                    .sessionManagement()
                        .maximumSessions(1);
        }


        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            System.out.println("password = " + passwordEncoder.encode("admin"));
            auth.userDetailsService(memberService).passwordEncoder(passwordEncoder);
        }
    }
}
