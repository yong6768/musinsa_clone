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
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Long id;

    @JoinColumn(name = "writer_id", nullable = false)
    @OneToOne
    @Getter
    @Setter
    private MemberEntity writer;

    @Column(name="title", nullable = false)
    @Getter
    @Setter
    private String title;

    @Column(name="content", nullable = false, columnDefinition = "MEDIUMTEXT")
    @Getter
    @Setter
    private String content;

    @Column(name="hit", nullable = false)
    @Getter
    @Setter
    private int hit;

    @Column(name="ctime", nullable = false)
    @CreatedDate
    @Getter
    @Setter
    private LocalDateTime createTime;

    //    @LastModifiedDate 사용 안함 - 조회수 수정시 반영때
    @Column(name="utime", nullable = false)
    @Getter
    @Setter
    private LocalDateTime updateTime;

    @Column(name="board_type", nullable = false)
    @Enumerated(EnumType.STRING)
    @Getter
    @Setter
    private BoardType boardType;

    @Column(name="board_status", nullable = false)
    @Enumerated(EnumType.STRING)
    @Getter
    @Setter
    private BoardStatus boardStatus;
}
