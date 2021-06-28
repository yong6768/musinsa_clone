package musinsa.clone.domain.board.news.dto;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import java.util.Arrays;

@Data
public class NewsWrite {

    @NotBlank
    private String title;

    @NotBlank
    private String content;

    @NotBlank
    private String[] brands;

    @NotBlank
    private String tags;
}
