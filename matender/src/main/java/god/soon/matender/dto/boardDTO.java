package god.soon.matender.dto;

import god.soon.matender.entity.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class boardDTO {

    private Long bdIdx;
    private String bdTitle;
    private LocalDateTime bdCreateDate;
    private String bdContent;
    private int bdViews;
    private int bdLike;

    public boardDTO(final BoardEntity boardEntity){
        this.bdIdx = boardEntity.getBdIdx();
        this.bdTitle = boardEntity.getBdTitle();
        this.bdCreateDate = boardEntity.getBdCreateDate();
        this.bdContent = boardEntity.getBdContent();
        this.bdViews = boardEntity.getBdViews();
        this.bdLike = boardEntity.getBdLike();
    }

    public static BoardEntity toEntity(final boardDTO dto){
        return BoardEntity.builder()
                .bdIdx(dto.getBdIdx())
                .bdTitle(dto.getBdTitle())
                .bdCreateDate(dto.getBdCreateDate())
                .bdContent(dto.getBdContent())
                .bdViews(dto.getBdViews())
                .bdLike(dto.getBdLike())
                .build();
    }

}
