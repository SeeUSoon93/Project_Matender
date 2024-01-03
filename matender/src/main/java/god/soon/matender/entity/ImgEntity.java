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
public class ImgEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imgIdx;
    private LocalDateTime imgCreateDate;
    @Lob
    private String imgPath;
    private String bdIdx;
    private String cockIdx;

    @Builder
    public ImgEntity(String imgPath, String bdIdx, String cockIdx){
        this.bdIdx = bdIdx;
        this.cockIdx = cockIdx;
        this.imgCreateDate = LocalDateTime.now();
        this.imgPath = imgPath;

    }


}
