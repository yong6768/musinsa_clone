package musinsa.clone.domain.brand.service;

import lombok.RequiredArgsConstructor;
import musinsa.clone.domain.brand.dao.BrandEntity;
import musinsa.clone.domain.brand.dto.BrandList;
import musinsa.clone.domain.brand.repository.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BrandService {
    private final BrandRepository brandRepository;

    public BrandList getBrandList() {
        List<BrandEntity> brandEntityList = brandRepository.findAll();
        return BrandList.of(brandEntityList);
    }
}
