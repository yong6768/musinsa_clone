package musinsa.clone.domain.brand.dao;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "brand")
@Getter
public class BrandEntity {
    @Id @GeneratedValue
    @Column(name="BRAND_ID")
    private Long brandId;

    @Column(name="name", length = 50, nullable = false)
    private String name;
}
