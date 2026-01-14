package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Data
class Book {
    private Long bookId;
    private String title;
    private String author;
    private List<String> categories;

}

public class JSON3Task {
    public static void main(String[] args) {
        System.out.println("[미션 2: 객체 -> JSON 변환 결과]");
        Book book1 = new Book(101L, "자바 마스터", "안선생", List.of("프로그래밍", "컴퓨터공학"));
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        String jsonData1 = gsonBuilder.toJson(book1);
        System.out.println(jsonData1);

        System.out.println();
        System.out.println("[미션 3: Map 변환 후 제목 추출");
        Map<String, Object> bookMap = gsonBuilder.fromJson(jsonData1, Map.class);
        System.out.println("도서 제목 : " + bookMap.get("title"));

        System.out.println();
        System.out.println("[미션 4: 리스트 -> JSON 배열 변환]");
        Book book2 = new Book(102L, "파이썬 입문", "김철수", Arrays.asList("데이터분석"));
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        String jsonBook = gsonBuilder.toJson(books);
        System.out.println(jsonBook);

    }
}
