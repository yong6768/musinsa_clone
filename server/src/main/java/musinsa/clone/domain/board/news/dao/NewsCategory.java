package musinsa.clone.domain.board.news.dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="NEWS_CATEGORY")
public class NewsCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    private Long id;

    @Column(name="name", nullable = false, length = 20)
    @Getter
    @Setter
    private String name;

    @Column(name="order", nullable = false)
    @Getter
    @Setter
    private int order;
}
