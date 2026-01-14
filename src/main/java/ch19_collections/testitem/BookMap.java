package ch19_collections.testitem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookMap {
    public static void main(String[] args) {
        Map<String, Integer> bookMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String bookName;
        int capa;
        int option = 0;

        while (option != 4) {
            System.out.println("""
                    --- 도서 재고 관리 프로그램 ---
                    1. 도서 추가
                    2. 재고 수정
                    3. 재고 목록
                    4. 종료""");
            System.out.print("메뉴를 선택하세요 >>> ");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 :
                    System.out.print("새 도서명을 입력하세요 >>> ");
                    bookName = scanner.nextLine();
                    System.out.print("재고 수량을 입력하세요 >>> ");
                    capa = scanner.nextInt();
                    bookMap.put(bookName, capa);
                    System.out.println(bookName + " 도서가 " + capa + " 권 추가되었습니다.");
                    break;
                case 2:
                    System.out.print("재고를 변경할 도서명을 입력하세요 >>> ");
                    bookName = scanner.nextLine();
                    System.out.print("새로운 재고 수량을 입력하세요 >>> ");
                    capa = scanner.nextInt();
                    bookMap.replace(bookName,capa);
                    System.out.println(bookName + " 도서가 " + capa + " 권으로 변경되었습니다.");
                    break;
                case 3:
                    System.out.println("--- 현재 재고 목록 ---");
                    for (Map.Entry<String, Integer> entry : bookMap.entrySet()) {
                        System.out.println("도서명 : " + entry.getKey() +
                                ", 재고 수량 : " + entry.getValue() + " 권");
                    }break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
