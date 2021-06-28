package musinsa.clone.domain.member;

import lombok.RequiredArgsConstructor;
import musinsa.clone.domain.member.dto.MemberSignUp;
import musinsa.clone.domain.member.entity.MemberEntity;
import musinsa.clone.domain.member.dto.UserDetailsImpl;
import musinsa.clone.domain.member.repository.MemberRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService implements UserDetailsService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public void save(MemberSignUp memberSignUp) {
        MemberEntity memberEntity = memberSignUp.toEntity(passwordEncoder);
        memberRepository.save(memberEntity);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MemberEntity memberEntity =  memberRepository.findByUsername(username).orElseThrow();
        return new UserDetailsImpl(memberEntity);
    }
}
