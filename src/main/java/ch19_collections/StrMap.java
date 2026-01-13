package ch19_collections;
/*
    Map은 key-value pair / 쌍 / entry
 */

import java.util.*;

public class StrMap {
    public static void main(String[] args) {
        Map<String, String> strMap1 = new HashMap<>();

        // key - value 삽입 메서드 -> .put(키, 값);
        strMap1.put("kor2026001", "김일");
        strMap1.put("kor2026002", "김이");
        strMap1.put("kor2026003", "김삼");
        strMap1.put("kor2026004", "김사");
        strMap1.put("kor2026005", "김오");
        System.out.println("strMap1 : " + strMap1);
        // 같은 key에 value를 입력하게 될 경우
        strMap1.put("kor2026005", "KimFive");
        System.out.println("strMap1 : " + strMap1);
        // key 하나 당 value는 하나이기 때문에 같은 key를 지정하고 value를 입력한다면
        // 가장 최근 걸로 덮어쓰기 된다. (변수처럼)

        Map<String, Double[]> koreanScores = new HashMap<>();
        koreanScores.put("김일", new Double[4]);

        Map<String, Double> koreanScores2 = new HashMap<>();
        koreanScores2.put("김일", 98.2);
        koreanScores2.put("김이", 100.0);
        koreanScores2.put("김삼", 22.2);
        koreanScores2.put("김사", 67.45);
        koreanScores2.put("김오", 70.1);
        // 특정 key의 value 수정
        // # 1 key를 정확하게 쓴 다음 value 수정
        koreanScores2.put("김오", 4.5);

        // # 2 .replace();
        koreanScores2.replace("김육", 123.2);
        System.out.println("Map<이름, 점수> : " + koreanScores2);

        /*
            .put()의 경우에는 기존에 key가 존재한다면 value에 재대입하게 되겠지만
            없는 key라면 아예 key를 새로 생성.

            반면 .replace()의 경우에는 존재하지 않는 key라면 value의 갱신이 일어나지 않음.
            key가 존재할 때만 value의 값이 변경됨.
         */

        // .containsKey() -> boolean
        boolean searchKeyFlag1 = strMap1.containsKey("kor2026001");
        System.out.println("kor2026001 존재 여부 : " + searchKeyFlag1);

        // .containsValue() -> boolean
        boolean searchValueFlag1 = strMap1.containsValue("김삼");
        System.out.println(strMap1.get("kor2026003") + " 존재 여부 : " + searchValueFlag1);

        // Map의 entry로부터 Set을 생성
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();
        // set 하나 생성하는데, 내부의 Key가 String, Value가 String인 Map이
        // Set의 각각의 element에 해당한다는 것을 의미

        Set<Map.Entry<String, String>> entrySet2 = strMap1.entrySet();
        // strMap1의 자료형은 Map인데, .entrySet()의 호출 결과가 Set<Map.Entry<String, String>>으로
        // 자동완성 된 이유는 그렇게 선언했기 때문.
        // 그렇다면 strMap1.entrySet()의 호출 결과가 일종의 형변환이 이루어진 로직이 있고
        // 해당 자료형으로 return 해서 entrySet2라는 객체에 데이터를 담았다고 해석할 수 있겠음.
        System.out.println("entrySet : " + entrySet2);

        // 근데 Map을 Set으로 바꿧다면 아까 학습한 내용을 토대로 봤을 때 Set -> List로 형변환 가능?
//        List<Map.Entry<String, String>> entryList1 = strMap1.     // 불가능
        // Set을 경유해야 할듯

        // Key Set 출력
        Set<String> keySet = strMap1.keySet();
        System.out.println(keySet);
        // Value Set
//        Set<String> valueSet = strMap1.values();  // 데이터 누락 때문에??
        // .values()를 봤을 때 Collection이라는 자료형이 return 된다는 것을 확인했기 때문에
        Collection<String> values = strMap1.values();
        System.out.println(values);
        System.out.println(strMap1);
        System.out.println("entrySet() : " + strMap1.entrySet());

    }
}
