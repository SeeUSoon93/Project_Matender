package god.soon.matender.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userIdx;
    private String username;
    private String email;
    private String gender;
    private String age;

    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.REMOVE)
    private List<BoardEntity> BoardList;

    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.REMOVE)
    private List<CocktailEntity> cocktailEntityList;

    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.REMOVE)
    private List<BoardRepleEntity> RepleList;

    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.REMOVE)
    private List<RecommendEntity> RecommendList;

    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.REMOVE)
    private List<BookmarkEntity> BookmarkList;

}
