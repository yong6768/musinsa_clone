package musinsa.clone.initData;

import musinsa.clone.domain.member.MemberEntity;
import musinsa.clone.domain.member.MemberRepository;
import musinsa.clone.domain.member.MemberType;
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

    private static void save(String memberId, String password, String name, String nickname, MemberType memberType) {
        MemberEntity memberEntity = MemberEntity.builder()
                .memberId(memberId)
                .password(passwordEncoder.encode(password))
                .name(name)
                .nickname(nickname)
                .memberType(memberType)
                .build();

        memberRepository.save(memberEntity);
    }
}
