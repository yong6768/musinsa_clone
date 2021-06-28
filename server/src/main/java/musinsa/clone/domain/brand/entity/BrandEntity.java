package musinsa.clone.domain.brand.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "brand")
@Getter
public class BrandEntity {
    @Id @GeneratedValue
    @Column(name="BRAND_ID")
    private Long brandId;

    @Column(name="NAME", length = 50, nullable = false)
    private String name;

    @Column(name="ENG_NAME", length = 50, nullable = false)
    private String engName;


    protected BrandEntity(){}
    protected BrandEntity(String name, String engName) {
        this.name = name;
        this.engName = engName;
    }


    public static BrandEntity of(String name, String engName) {
        return new BrandEntity(name, engName);
    }
}
