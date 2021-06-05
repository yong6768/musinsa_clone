package musinsa.clone.domain.member;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="member")
@NoArgsConstructor
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Long id;


    @Column(name="member_id", nullable = false, length = 20)
    @Getter
    @Setter
    private String memberId;

    @Column(name="password", nullable = false, length = 100)
    @Getter
    @Setter
    private String password;

    @Column(name="member_type", nullable = false)
    @Enumerated(EnumType.STRING)
    @Getter
    @Setter
    private MemberType memberType;

    @Column(name="name", nullable = false, length = 20)
    @Getter
    @Setter
    private String name;

    @Column(name="nickname", nullable = false, length = 20)
    @Getter
    @Setter
    private String nickname;
}
