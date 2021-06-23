package musinsa.clone.domain.member;

import lombok.Getter;
import javax.persistence.*;

@Entity
@Table(name="MEMBER")
@Getter
public class MemberEntity {
    @Id @GeneratedValue
    @Column(name="MEMBER_ID")
    private Long memberId;

    @Column(name="USERNAME", nullable = false, length = 20)
    private String username;

    @Column(name="PASSWORD", nullable = false, length = 100)
    private String password;

    @Column(name="MEMBER_TYPE", nullable = false)
    @Enumerated(EnumType.STRING)
    private MemberType memberType;

    @Column(name="NAME", nullable = false, length = 20)
    private String name;

    @Column(name="NICKNAME", nullable = false, length = 20)
    private String nickname;

    protected  MemberEntity() {}

    protected MemberEntity(String username, String password, MemberType memberType, String name, String nickname) {
        this.username = username;
        this.password = password;
        this.memberType = memberType;
        this.name = name;
        this.nickname = nickname;
    }

    public static MemberEntity create(String username, String password, MemberType memberType, String name, String nickname) {
        return new MemberEntity(username, password, memberType, name, nickname);
    }
}
