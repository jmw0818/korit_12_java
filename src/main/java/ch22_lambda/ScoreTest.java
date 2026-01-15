package ch22_lambda;

import java.util.List;

public class ScoreTest {
    public static void main(String[] args) {
        List<Integer> scores = List.of(23, 1654, 67, 147, 11, 5, 4, 98, 66, 53);
        scores.stream()                            // 1. StreamAPI 사용
                .filter(s -> s >= 60)       // 2. 60점 미만 제외
                .map(s -> s + 5)            // 3. 남아있는 것들에 5점씩 더함
                .sorted()                          // 4. 오름 차순으로 정렬
                .forEach(System.out::println);     // 5. 각각 출력
    }
}
