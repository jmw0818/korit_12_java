package ch16_bean;

import lombok.*;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@Getter     // 클래스 레벨
public class UserEntityLombok {
    private int username;
    @Setter     // 필드레벨
    private int password;
    @NonNull
    private String email;
    @NonNull
    private String name;    // final을 쓰게된다면...? 여러가지 오류들이 있음
                            // @NoArgsConstructor 수정이 필요 -> 삭제?
                            // UserEntityLombok user2 = new UserEntityLombok("email"); 수정이 필요
                            // -> name 추가 필요
                            // or email 필드에 @NonNull 추가
}
