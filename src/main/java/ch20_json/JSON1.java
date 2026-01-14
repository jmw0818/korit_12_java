package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {
    public static void main(String[] args) {
        JsonObject jsonObject = new JsonObject();

        // 속성(키-값 쌍)을 추가하는 메서드 : addProperty()
        jsonObject.addProperty("username", 1);
        jsonObject.addProperty("password", 1234);
        jsonObject.addProperty("email", "a@test.com");
        jsonObject.addProperty("name", "김일");
        jsonObject.addProperty("score", 4.5);

        System.out.println(jsonObject);

        /*
            Map과의 차이가 있다면
            1. Map에서는 key에 ""가 없었고, JSON에서는 모든 key에 String 자료형처럼 보이도록 ""가 있음.
            2. Map에서는 콘솔창에서 출력될 때 key1 = value1으로 "="로 표기됐지만
                JSON에서는 "key1" : value1의 형태로 작성되었음.
         */
        jsonObject.addProperty("job", "대학생 인턴");
        System.out.println(jsonObject);
        jsonObject.addProperty("job", "대기업 정규직");
        System.out.println(jsonObject);
        // Map에서처럼 동일한 key 값을 가지고 있다면 갱신됨.
        /*
            컴퓨터에서 콘솔에 출력한 결과를 확인했을 때,
            JSON 결과값이 한 줄로 길게 늘어져 있다.
            나무위키에서는 막 엔터쳐놓고 있는데 그래서 가독성을 개선하는 방법으로 출력하기도 함.
            컴퓨터가 읽기 편한 방식이 아니라 사람이 읽기 적합한 형태로 출력하는 것을
            pretty printing이라고 표현합니다.
         */
        Gson gson = new GsonBuilder().setPrettyPrinting().create();     // 상속과 체이닝메서드
        String jsonData = gson.toJson(jsonObject);      // toJson : 제이슨 데이터로 변환
        System.out.println(jsonData);       // PrettyPrinting 형태로 출력


    }



}
