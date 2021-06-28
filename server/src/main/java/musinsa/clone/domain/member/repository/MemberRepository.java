package musinsa.clone.domain.member.repository;

import musinsa.clone.domain.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, Long>, MemberRepositoryCustom {

     Optional<MemberEntity> findByUsername(String username);
     MemberEntity save(MemberEntity e);
}
