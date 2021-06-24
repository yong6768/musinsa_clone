package musinsa.clone.domain.board.news.dto;

import lombok.Data;
import javax.validation.constraints.NotBlank;

@Data
public class NewsWrite {

    @NotBlank
    private String title;

    @NotBlank
    private String content;

    private String[] brands;

    private String tags;

}
