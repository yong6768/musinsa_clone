package musinsa.clone.domain.member.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import musinsa.clone.domain.member.MemberType;
import musinsa.clone.domain.member.entity.MemberEntity;
import org.springframework.security.crypto.password.PasswordEncoder;

@Getter
@NoArgsConstructor
public class MemberSignUp {

    private String username;
    private String password;
    private String passwordConf;
    private String name;
    private String nickname;
    private MemberType memberType;

    public MemberEntity toEntity(PasswordEncoder passwordEncoder) {
        return MemberEntity.of(
                username,
                passwordEncoder.encode(password),
                memberType,
                name,
                nickname
        );
    }
}
