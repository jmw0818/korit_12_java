package ch19_collections.testitem;

import java.util.*;

public class Meeting {
    public static void main(String[] args) {
        Set<String> meetPeople = new HashSet<>();
        List<String> meetingList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name = "";
        System.out.println("--- 모임 참석자 명단 관리 ---");
        System.out.println("[ 종료 ] 라고 입력하면 프로그램을 종료합니다.");
        while (!name.equals("종료")) {
            System.out.print("참석자 이름을 입력하세요 >>> ");
            name = scanner.nextLine();
            if (!name.equals("종료")) {
                meetPeople.add(name);
            }
        }
        meetingList.addAll(meetPeople);     // list 형변환
        System.out.println("프로그램이 종료되었습니다.\n");
        System.out.println("--- 최종 참석자 명단 ---");
        for (int i = 0; i < meetingList.size(); i++) {
            if (i == meetingList.size()-1) {        // 마지막 항
                System.out.println(meetingList.get(i));
            }
            System.out.println(meetingList.get(i) + ", ");
        }
    }
}
