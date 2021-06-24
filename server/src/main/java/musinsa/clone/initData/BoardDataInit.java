package musinsa.clone.initData;

import musinsa.clone.domain.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class BoardDataInit {
    private BoardDataInit(){}

    private static MemberRepository memberRepository;
    private static PasswordEncoder passwordEncoder;

    @Autowired
    public void set(MemberRepository memberRepository, PasswordEncoder passwordEncoder) {
        this.memberRepository = memberRepository;
        this.passwordEncoder = passwordEncoder;
    }
}
