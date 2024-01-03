package god.soon.matender.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class IngredientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long igIdx;
    private String igName;
    private String igVolume;

    @ManyToOne
    @JoinColumn(name = "cockIdx")
    private CocktailEntity cocktailEntity;

    @Builder
    public IngredientEntity(String igName, String igVolume, CocktailEntity cocktailEntity){
        this.cocktailEntity = cocktailEntity;
        this.igName = igName;
        this.igVolume = igVolume;

    }
}
