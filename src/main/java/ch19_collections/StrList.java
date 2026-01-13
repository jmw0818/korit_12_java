package ch19_collections;

import java.util.*;

public class StrList {
    public static void main(String[] args) {
        // Array와의 차이점 # 1
        String[] strArray = new String[5];
        List<String> strList = new ArrayList<>();   // List 선언 방식 및 초기화

        // Array와의 차이점 # 2 - 대입 방법
        strArray[0] = "김영";
        strArray[4] = "김사";

        strList.add("Java");
        strList.add("Python");
        strList.add("JavaScript");
        strList.add("C#");
        strList.add("C++");
        // 집어넣은 순서대로 값이 들어감
        // 최초에 방의 개수를 정하지 않아도 알아서 방이 늘어남.

        // Array와의 차이점 # 3 - 출력 방식
        System.out.println(Arrays.toString(strArray));
        System.out.println(strList);

        // Array와의 차이점 # 4 - 삭제 방식
        strArray[0] = null;
        String removeElem1 = "JavaScript";
        boolean isRemoved = strList.remove(removeElem1);
        System.out.println(removeElem1 + " 삭제 여부 : " + isRemoved);
        System.out.println(strList);
        // List의 경우 삭제하니 방이 줄어들었음.

        // 정렬 방법
        // 배열은 Arrays.sort
        Collections.sort(strList);
        System.out.println(strList);
        Collections.sort(strList, Comparator.reverseOrder());   // 내림차순
        System.out.println(strList);

        /*
            특정 element의 검색 -> .contains() 메서드 사용
            리스트명.contains(목적어)
         */
        String searchElem1 = "Python";
        boolean contains1 = strList.contains(searchElem1);
        System.out.println(searchElem1 + " 포함 여부 : " + contains1);

        String searchElem2 = "Py";
        boolean contains2 = strList.contains(searchElem2);
        System.out.println(searchElem2 + " 포함 여부 : " + contains2);
        /*
            list는 element가 명확하게 일치하는 지를 확인함.
            Py는 Python이라는 String 데이터의 일부이기는 하지만
            element 전체를 의미하는 것은 아니기 떄문에 false 값이 나오게 됨.
         */
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = "김" + i;
        }
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " 님 / ");
        }
        System.out.println();
        for (String str : strArray) {
            System.out.print(str + " 학생 - ");
        }
        System.out.println();

        // list는 index 추출할 때 리스트명.size()를 사용. method 인 점을 주의
        for (int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i) + " 언어 / ");
        }
        System.out.println();
        for (String list : strList) {
            System.out.print(list + " 공부 / ");
        }
        System.out.println();

        strList.add(2, "JavaScript");
        System.out.println(strList);
        /*
            향상된 for문의 장점 : 내부의 index지정을, .length를 쓰는지, .size()를 쓰는지 등을 고려하지 않아도 된다는 점
            출력할 때 [] 인덱스 넘버를 사용해야 하는지, .get()을 사용해야 하는지 등을 따지지 않아도 된다는 점.
         */
    }
}
