package god.soon.matender.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bdIdx;
    private String bdTitle;
    private LocalDateTime bdCreateDate;
    @Lob
    private String bdContent;
    private int bdViews;
    private int bdLike;

    @ManyToOne
    @JoinColumn(name = "username")
    private UserEntity userEntity;

    @OneToMany(mappedBy = "boardEntity", cascade = CascadeType.REMOVE)
    private List<BoardRepleEntity> boardRepleEntityList;

    @Builder
    public BoardEntity(String bdTitle, String bdContent, UserEntity userEntity){
        this.bdTitle = bdTitle;
        this.bdContent = bdContent;
        this.bdCreateDate=LocalDateTime.now();
        this.userEntity = userEntity;

    }
}
