package musinsa.clone.domain.board.news.dao;

import lombok.Getter;
import musinsa.clone.domain.board.BoardEntity;
import musinsa.clone.domain.board.news.category.NewsCategory;

import javax.persistence.*;

@Entity(name="NEWS")
@Table(name="NEWS")
@DiscriminatorValue("NEWS")
public class NewsEntity extends BoardEntity {

    @Column(name="CATEGORY_NAME")
    @Enumerated(EnumType.STRING)
    @Getter
    private NewsCategory newsCategory;
}
