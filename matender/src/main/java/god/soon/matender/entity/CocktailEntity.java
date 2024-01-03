package god.soon.matender.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class CocktailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cockIdx;
    private String cockTitle;
    private String cockCategory;
    private LocalDateTime cockCreateDate;
    private int cockAlc;
    private int cockLike;
    private String cockBase;
    @Lob
    private String cockContent;
    @Lob
    private String cockRecipe;

    @ManyToOne
    @JoinColumn(name = "username")
    private UserEntity userEntity;

    @OneToMany(mappedBy = "cocktailEntity", cascade = CascadeType.REMOVE)
    private List<CocktailRepleEntity> cocktailRepleEntityList;

    @OneToMany(mappedBy = "cocktailEntity", cascade = CascadeType.REMOVE)
    private List<BookmarkEntity> bookmarkEntityList;

    @OneToMany(mappedBy = "cocktailEntity", cascade = CascadeType.REMOVE)
    private List<IngredientEntity> ingredientEntityList;

    @Builder
    public CocktailEntity(String cockTitle, String cockCategory, String cockContent, int cockAlc,
    String cockRecipe, String cockBase, UserEntity userEntity){
        this.cockTitle = cockTitle;
        this.cockCategory = cockCategory;
        this.cockAlc =cockAlc;
        this.cockRecipe = cockRecipe;
        this.cockBase = cockBase;
        this.cockCreateDate = LocalDateTime.now();
        this.userEntity = userEntity;
        this.cockContent = cockContent;

    }
}
