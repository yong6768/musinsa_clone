package musinsa.clone.domain.member.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import musinsa.clone.domain.member.MemberEntity;
import musinsa.clone.domain.member.MemberType;

@Getter
@NoArgsConstructor
public class MemberSignUp {

    private String memberId;
    private String password;
    private String passwordConf;
    private String name;
    private String nickname;
    private MemberType memberType;

    public MemberEntity toDAO() {
        return MemberEntity.builder()
                .memberId(memberId)
                .password(password)
                .name(name)
                .nickname(nickname)
                .memberType(memberType)
                .build();
    }

}
