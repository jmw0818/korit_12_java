package ch19_collections.testitem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookMap3 {
    public static void main(String[] args) {
        Map<String, Integer> bookMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String bookName;
        int stock;
        boolean endOfProgram = true;

        while (endOfProgram) {
            System.out.println("""
                    --- 도서 재고 관리 프로그램 ---
                    1. 도서 추가
                    2. 재고 입고
                    3. 재고 출고
                    4. 재고 목록
                    5. 종료""");
            System.out.print("메뉴를 선택하세요 >>> ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 :
                    System.out.print("새 도서명을 입력하세요 >>> ");
                    bookName = scanner.nextLine();
                    if (bookMap.containsKey(bookName)) {
                        System.out.println("이미 재고에 있는 도서입니다.");
                    } else {
                        System.out.print("재고 수량을 입력하세요 >>> ");
                        stock = scanner.nextInt();
                        bookMap.put(bookName, stock);
                        System.out.println(bookName + " 도서가 " + stock + " 권 추가되었습니다.");
                    }
                    break;
                case 2:
                    System.out.print("입고할 도서명을 입력하세요 >>> ");
                    bookName = scanner.nextLine();
                    System.out.print("입고되는 수량을 입력하세요 >>> ");
                    int temp = scanner.nextInt();
                    stock = bookMap.get(bookName) + temp;
                    bookMap.replace(bookName, stock);
                    System.out.println(bookName + " 도서가 " + temp + " 권 입고되어 "
                            + stock + " 권이 되었습니다.");
                    break;
                case 3:
                    System.out.print("출고할 도서명을 입력하세요 >>> ");
                    bookName = scanner.nextLine();
                    System.out.print("출고되는 수량을 입력하세요 >>> ");
                    stock = scanner.nextInt();
                    if (stock > bookMap.get(bookName)) {
                        System.out.println("재고가 충분하지 않습니다.");
                    } else {
                        int changedStock = bookMap.get(bookName) - stock;
                        bookMap.replace(bookName, changedStock);
                        System.out.println(bookName + " 도서가 " + stock + " 권 출고되어 "
                                + changedStock +  " 권이 되었습니다.");
                    }
                    break;
                case 4:
                    System.out.println("--- 현재 재고 목록 ---");
                    for (Map.Entry<String, Integer> entry : bookMap.entrySet()) {
                        System.out.println("도서명 : " + entry.getKey() +
                                ", 재고 수량 : " + entry.getValue() + " 권");
                    }break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    endOfProgram = !endOfProgram;
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
