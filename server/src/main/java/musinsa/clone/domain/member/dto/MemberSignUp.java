package musinsa.clone.domain.member.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import musinsa.clone.domain.member.MemberType;

@Getter
@NoArgsConstructor
public class MemberSignUp {

    private String username;
    private String password;
    private String passwordConf;
    private String name;
    private String nickname;
    private MemberType memberType;

}
