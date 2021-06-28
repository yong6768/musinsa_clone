package musinsa.clone.domain.brand.dto;

import lombok.Getter;
import lombok.ToString;
import musinsa.clone.domain.brand.entity.BrandEntity;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Brand 리스트 반환용 DTO
 */
@Getter
@ToString
public class BrandList {
    private int size;
    private List<BrandListElem> brandList;

    /**
     * BarndEntity 리스트로 생성
     */ 
    public static BrandList of(List<BrandEntity> brandEntityList) {
        List<BrandListElem> mappedList = brandEntityList.stream()
                .map(BrandListElem::new).collect(Collectors.toList());
        return new BrandList(mappedList);
    }

    private BrandList(List<BrandListElem> list) {
        this.size = list.size();
        this.brandList = list;
    }

    @Getter
    public static class BrandListElem {
        private Long id;
        private String name;
        private String engName;

        public BrandListElem(BrandEntity e) {
            this.id = e.getBrandId();
            this.name = e.getName();
            this.engName = e.getEngName();
        }
    }
}
