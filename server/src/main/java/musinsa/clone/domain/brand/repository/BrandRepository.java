package musinsa.clone.domain.brand.repository;

import musinsa.clone.domain.brand.entity.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<BrandEntity, Long>, BrandRepositoryCustom {
}
