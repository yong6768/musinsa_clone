package musinsa.clone.initData;

import musinsa.clone.domain.member.dao.MemberEntity;
import musinsa.clone.domain.member.MemberType;
import musinsa.clone.domain.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class MemberDataInit {
    private MemberDataInit(){}

    private static MemberRepository memberRepository;
    private static PasswordEncoder passwordEncoder;

    @Autowired
    public void set(MemberRepository memberRepository, PasswordEncoder passwordEncoder) {
        this.memberRepository = memberRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public static void init() {
        save("admin", "admin", "홍길동", "홍길동 닉네임", MemberType.ADMIN);
    }

    private static void save(String username, String password, String name, String nickname, MemberType memberType) {
        MemberEntity memberEntity = MemberEntity.of(username, passwordEncoder.encode(password), memberType, name, nickname);
        memberRepository.save(memberEntity);
    }
}
