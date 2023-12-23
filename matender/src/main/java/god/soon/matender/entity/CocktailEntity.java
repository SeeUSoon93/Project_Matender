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
public class CocktailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cockIdx;
    private String cockTitle;
    private String cockCategory;
    private LocalDateTime cockCreateDate;
    private int cockAlc;
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
    private List<RecommendEntity> recommendEntityList;

    @OneToMany(mappedBy = "cocktailEntity", cascade = CascadeType.REMOVE)
    private List<BookmarkEntity> bookmarkEntityList;

    @OneToMany(mappedBy = "cocktailEntity", cascade = CascadeType.REMOVE)
    private List<IngredientEntity> ingredientEntityList;
}
