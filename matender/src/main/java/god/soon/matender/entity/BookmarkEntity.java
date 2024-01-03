package god.soon.matender.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class BookmarkEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookmarkIdx;

    @ManyToOne
    @JoinColumn(name = "username")
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "cockIdx")
    private CocktailEntity cocktailEntity;

    @Builder
    public BookmarkEntity(UserEntity userEntity, CocktailEntity cocktailEntity){
        this.userEntity = userEntity;
        this.cocktailEntity = cocktailEntity;
    }
}
