package ch19_collections;
/*
    List는 순사가 있고 중복 허용
    Set은 순서는 없고 중복은 허용하지 않기 때문에
    List -> Set 혹은 Set -> List로의 형변환이 중요
    List로 전체 설문을 받고, Set을 통해 중복을 제거하여
    후보군만 남기는 등의 형태로 사욛할 수 있음.
    또한 Set으로 중복을 제거한 후에 다시 List로 돌려서
    .get(index)로 조회 할 수도 있음. (Set은 순서가 없어서)

 */

import java.util.*;

public class StrSet {
    public static void main(String[] args) {
        Set<String> strSet = new HashSet<>();
        List<String> strList = new ArrayList<>();

//        strSet.add("java");
//        strSet.add("java");
//        strSet.add("java");
//        strSet.add("python");
//        strSet.add("python");
//        strSet.add("python");
//        strSet.add("python");
//        strSet.add("springboot");
//        strSet.add("springboot");

        System.out.println(strSet); // 중복 제거되어 있음.

        strList.add("java");
        strList.add("java");
        strList.add("java");
        strList.add("python");
        strList.add("python");
        strList.add("python");
        strList.add("python");
        strList.add("springboot");
        strList.add("springboot");
        System.out.println(strList);

        // List의 element들을 전부 Set에 대입 : 세트명.addAll(리스트명);
        strSet.addAll(strList);
        System.out.println(strSet);     // 중복 제거
        for (String str : strSet) {
            System.out.println(str);
        }
        // 일반 for 문으로는 Set에 index가 없기때문에 불가능
//        for (int i = 0; i < strSet.size(); i++) {
//            System.out.println(strSet.get());
//        }

        // 중복 제거 후 다시 list에 옮기기
        List<String> modifiedList = new ArrayList<>();
        modifiedList.addAll(strSet);
        System.out.println(modifiedList);
        Collections.sort(modifiedList);
        System.out.println(modifiedList);
    }
}
