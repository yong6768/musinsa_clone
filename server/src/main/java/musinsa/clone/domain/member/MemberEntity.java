package musinsa.clone.domain.member;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="member")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="member_id", nullable = false, length = 20)
    private String memberId;

    @Column(name="password", nullable = false, length = 100)
    private String password;

    @Column(name="member_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private MemberType memberType;

    @Column(name="name", nullable = false, length = 20)
    private String name;

    @Column(name="nickname", nullable = false, length = 20)
    private String nickname;

    public static class MemberEntityBuilder {
        private MemberEntityBuilder id(Long id){return  this;}
    }
}
