package musinsa.clone.domain.member.dto;

import lombok.Getter;
import musinsa.clone.domain.member.MemberEntity;
import musinsa.clone.domain.member.MemberType;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Getter
public class UserDetailsImpl implements UserDetails {
    private String memberId;
    private String memberPassword;
    private MemberType memberType;

    public UserDetailsImpl(MemberEntity memberEntity) {
        this.memberId = memberEntity.getMemberId();
        this.memberPassword = memberEntity.getPassword();
        this.memberType = memberEntity.getMemberType();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"));
//        return null;
    }

    @Override
    public String getPassword() {
        return getMemberPassword();
    }

    @Override
    public String getUsername() {
        return getMemberId();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
