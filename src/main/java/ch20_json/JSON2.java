package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@ToString
class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class JSON2 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        // 하나는 한 줄 출력 / 하나는 pretty printing 적용한 버전

        User user1 = new User("kim1", "9876", "a@test.com", "김일", "20");
        // Builder 이용하는 방법
        String jsonData1 = gson.toJson(user1);
        String jsonData2 = gsonBuilder.toJson(user1);
        System.out.println(jsonData1);
        System.out.println(jsonData2);

        /*
            Map 자료형을 -> json 데이터로 바꾸는 것도 가능함.
         */

        Map<String, String> productMap1 = new HashMap<>();
        productMap1.put("productCode", "MYWY3KH/A");
        productMap1.put("productName", "아이폰 16 프로 맥스");

        String jsonProduct1 = gson.toJson(productMap1);
        String jsonProduct2 = gsonBuilder.toJson(productMap1);
        System.out.println(jsonProduct1);
        System.out.println(jsonProduct2);
        /*
            이상의 두 사례에서 toJson()이라는 메서드는 argument로 Java Object(객체) 자체를 넣는 것도,
            Map으로 생성된 entry를 Json 형태로 바꾸는 것도 가능하다는 것을 알 수 있음.
            JsonObject 객체도 바꿀 수 있겠음

            그렇다면 반대로 json -> Map / Java Object로 바꾸는 것은?
            String data인 json을 "" 포함해서 생성하는게 너무 귀찮기 때문에
            user1과 productMap1을 json으로 바꾼 데이터를 바꿔보도록 하겠음.

            jsonData2를 user2 객체로 변경. String -> User 로 바뀜
            jsonProduct2를 productMap2로 변경
         */
        User user2 = gsonBuilder.fromJson(jsonData2, User.class);
        System.out.println(user2);
        Map<String, String> productMap2 = gson.fromJson(jsonProduct2, Map.class);
        System.out.println(productMap2);

        // 그렇다면 JsonData1 / 2 를 userMap1 으로 바꿀 수 있겠음.
        // field : fieldValue 로 일대일 매칭이 가능하니
        /*
            하지만 jsonProduct1 / 2 는 Java Object로 못 바꿈 -> 클래스가 아직 정의되지 않았으니

            그러면 jsonData1을 Map 자료형의 userMap1으로 변경하시오.
            그리소 콘솔에 출력하시오.
         */
        Map<String, String> userMap1 = gson.fromJson(jsonData1, Map.class);
        System.out.println(userMap1);       // 표기법 확인 (Map 표기법)

        List<User> users = new ArrayList<>();
        users.add(user1);
        System.out.println(users);
        String jsonUesrs = gsonBuilder.toJson(users);       // json으로 변환
        System.out.println(jsonUesrs);


    }
}
