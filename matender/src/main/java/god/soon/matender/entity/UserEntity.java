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
    private String nickname;
    private String email;
    private String gender;
    private int age;

    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.REMOVE)
    private List<BoardEntity> BoardList;

    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.REMOVE)
    private List<CocktailEntity> cocktailList;

    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.REMOVE)
    private List<BoardRepleEntity> boardRepleList;

    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.REMOVE)
    private List<BookmarkEntity> BookmarkList;

    @Builder
    public UserEntity(String nickname, String email, String gender, int age) {
        this.email = email;
        this.nickname = nickname;
        this.gender = gender;
        this.age = age;
    }

}
