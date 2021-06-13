package musinsa.clone.utils;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Base64;

@Component
@RequiredArgsConstructor
public class JwtTokenProvider {

    private final long TOKEN_VALIDATION_MILISECOND = 30 * 60* 1000L; // 30분

    @Value("spring.jwt.secret")
    private String secretKey;

    private final UserDetailsService userDetailsService;

    @PostConstruct
    protected void init() {
        secretKey = Base64.getEncoder().encodeToString(secretKey.getBytes());
    }
}

//https://imbf.github.io/spring/2020/06/29/Spring-Security-with-JWT.html