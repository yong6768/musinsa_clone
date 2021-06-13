package musinsa.clone.domain.board;

import lombok.Getter;
import lombok.Setter;
import musinsa.clone.domain.member.MemberEntity;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="BOARD")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="BOARD_TYPE")
public class BoardEntity {

    @Id
    @GeneratedValue
    @Getter
    private Long id;

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
