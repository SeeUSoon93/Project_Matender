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
public class CocktailRepleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cRepleIdx;
    @Lob
    private String cRepleContent;
    private LocalDateTime cRepleCreateDate;

    @ManyToOne
    @JoinColumn(name = "username")
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "cockIdx")
    private CocktailEntity cocktailEntity;

    @Builder
    public CocktailRepleEntity(String cRepleContent, UserEntity userEntity, CocktailEntity cocktailEntity){
        this.cocktailEntity = cocktailEntity;
        this.userEntity = userEntity;
        this.cRepleContent = cRepleContent;
        this.cRepleCreateDate = LocalDateTime.now();

    }

}
