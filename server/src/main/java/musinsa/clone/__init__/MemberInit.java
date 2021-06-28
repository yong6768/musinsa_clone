package musinsa.clone.__init__;

import musinsa.clone.domain.member.MemberType;
import musinsa.clone.domain.member.entity.MemberEntity;
import musinsa.clone.domain.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@ConditionalOnProperty(prefix = "custom", name="init-data", havingValue = "true")
public class MemberInit {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private MemberRepository memberRepository;

   @PostConstruct
   public void init() {
       createAdminMember();
   }

   private void createAdminMember() {
        MemberEntity memberEntity = createMemberEntity("admin", "admin", MemberType.ADMIN, "홍길동", "홍길동 닉네임");
        memberRepository.save(memberEntity);
   }

   private MemberEntity createMemberEntity(String username, String password, MemberType memberType, String name, String nickname) {
       return MemberEntity.of(username, passwordEncoder.encode(password), memberType, name, nickname);
   }
}
