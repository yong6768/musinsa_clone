package musinsa.clone.domain.board;

import lombok.Getter;
import lombok.Setter;
import musinsa.clone.domain.member.entity.MemberEntity;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="BOARD")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="BOARD_TYPE")
public class BoardEntity {

    @Id
    @GeneratedValue
    @Getter
    @Column(name="BOARD_ID")
    private Long boardId;

    @JoinColumn(name = "WRITER_ID", nullable = false)
    @ManyToOne
    @Getter @Setter
    private MemberEntity writer;

    @Column(name="TITLE", nullable = false)
    @Getter @Setter
    private String title;

    @Column(name="CONTENT", nullable = false)
    @Lob
    @Getter @Setter
    private String content;

    @Column(name="HIT", nullable = false)
    @Getter @Setter
    private int hit;

    @ElementCollection
    @CollectionTable(name = "tag",
            joinColumns = {
                @JoinColumn(name="BOARD_ID")
            }
    )
    @Column(name="name", length = 20)
    private List<String> tags = new ArrayList<>();

    @Column(name="CREATED_AT", nullable = false)
    @CreatedDate
    @Getter @Setter
    private LocalDateTime createdAt;

    //    @LastModifiedDate 사용 안함 - 조회수 수정시 반영때문
    @Column(name="MODIFIED_AT", nullable = false)
    @Getter @Setter
    private LocalDateTime modifiedAt;

    @Column(name="STATUS", nullable = false)
    @Enumerated(EnumType.STRING)
    @Getter @Setter
    private BoardStatus status;
}
