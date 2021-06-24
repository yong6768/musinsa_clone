package musinsa.clone.domain.brand.repository;

import musinsa.clone.domain.brand.dao.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<BrandEntity, Long>, BrandRepositoryCustom {
}
