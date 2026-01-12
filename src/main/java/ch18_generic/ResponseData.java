package ch18_generic;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseData<T> {
    private String message;
    private T data;     // data의 자료형은 아직 미결정

}
/*
    제네릭을 쓸거라면 class에 추가적인 명령어가 필요합니다.
    <T>
    이거 빼먹고 field에 T 를 사용하면 오류 발생.
 */
