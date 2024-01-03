package god.soon.matender.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class BoardRepleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bRepleIdx;
    @Lob
    private String bRepleContent;
    private LocalDateTime bRepleCreateDate;

    @ManyToOne
    @JoinColumn(name = "username")
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "bdIdx")
    private BoardEntity boardEntity;

    @Builder
    public BoardRepleEntity(UserEntity userEntity, BoardEntity boardEntity, String bRepleContent){
        this.userEntity = userEntity;
        this.boardEntity = boardEntity;
        this.bRepleContent = bRepleContent;
        this.bRepleCreateDate = LocalDateTime.now();
    }
}
