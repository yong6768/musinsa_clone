package musinsa.clone.domain.member;

import lombok.RequiredArgsConstructor;
import musinsa.clone.domain.member.dto.MemberSignUp;
import musinsa.clone.domain.member.dto.UserDetailsImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService implements UserDetailsService {

    private final MemberRepository memberRepository;

    public void save(MemberSignUp memberSignUp) {
        MemberEntity memberEntity = memberSignUp.toDAO();
        memberRepository.save(memberEntity);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("username = " + username);
        MemberEntity memberEntity =  memberRepository.findByMemberId(username).orElseThrow();
        System.out.println(memberEntity.getMemberId());
        System.out.println(memberEntity.getPassword());
        return new UserDetailsImpl(memberEntity);
    }
}
