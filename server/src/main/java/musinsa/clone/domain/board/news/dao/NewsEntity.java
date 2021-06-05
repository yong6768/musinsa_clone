package musinsa.clone.domain.board.news.dao;

import lombok.Getter;
import lombok.Setter;
import musinsa.clone.domain.board.BoardEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="NEWS")
public class NewsEntity extends BoardEntity {

    @JoinColumn(name="news_category_id")
    @OneToOne
    @Getter
    @Setter
    private NewsCategory newsCategory;
}
