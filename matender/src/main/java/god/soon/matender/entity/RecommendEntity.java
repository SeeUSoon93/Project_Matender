package god.soon.matender.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class RecommendEntity {

    @ManyToOne
    @JoinColumn(name = "username")
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "cockIdx")
    private CocktailEntity cocktailEntity;
}
