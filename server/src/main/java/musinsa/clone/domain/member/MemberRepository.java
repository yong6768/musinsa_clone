package musinsa.clone.domain.member;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final JpaMemberRepository jpaMemberRepository;

    @Repository
    private interface JpaMemberRepository extends JpaRepository<MemberEntity, Long> {
        Optional<MemberEntity> findByMemberId(final String memberId);
        MemberEntity save(MemberEntity memberEntity);
    }


    public Optional<MemberEntity> findByMemberId(final String memberId) {
        return jpaMemberRepository.findByMemberId(memberId);
    }

    public Optional<MemberEntity> findById(final Long id) {
        return jpaMemberRepository.findById(id);
    }

    public MemberEntity save(MemberEntity memberEntity) {
        return jpaMemberRepository.save(memberEntity);
    }
}
