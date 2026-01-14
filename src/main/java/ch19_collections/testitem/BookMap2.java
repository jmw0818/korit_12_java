package ch19_collections.testitem;

import java.util.*;

public class BookMap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> bookInventory = new HashMap<>();
        bookInventory.put("Java프로그래밍 입문", 2);
        String bookTitle;
        boolean endOfProgram = false;
        while (!endOfProgram) {
            System.out.println("--- 도서 재고 관리 프로그램 ---");
            System.out.println("1. 도서 추가\n2. 재고 수정\n3. 재고 목록\n4. 종료");
            System.out.print("메뉴를 선택하세요 >>> ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.print("새 도서명을 입력하세요 >>> ");
                    bookTitle = scanner.nextLine();
                    if (bookInventory.containsKey(bookTitle)) {
                        System.out.println("이미 재고에 있는 도서입니다.");
                    } else {
                        System.out.print("재고 수량을 입력하세요 >>> ");
                        int stock = scanner.nextInt();
                        scanner.nextLine();
                        bookInventory.put(bookTitle,stock);
                        System.out.println(bookTitle + " 도서가 " + stock + " 권 추가되었습니다.");
                    }
                    break;
                case 2:
                    System.out.println("수량을 변경할 도서명을 입력하세요 >>> ");
                    bookTitle = scanner.nextLine();
                    if (bookInventory.containsKey(bookTitle)) {
                        // 기존 가이드
//                        System.out.print("새로운 재고 수량을 입력하세요 >>> ");
//                        int stock = scanner.nextInt();
//                        scanner.nextLine();
//                        bookInventory.replace(bookTitle,stock);
//                        System.out.println(bookTitle + " 도서가 " + stock + " 권 으로 변경되었습니다.");

                        // 추가분을 입력하면 기존 것에서 더하는 로직 생각.
                        System.out.print("재고 변경분을 입력하세요 >>> ");
                        int temp = scanner.nextInt();
                        scanner.nextLine();
                        int stock = bookInventory.get(bookTitle) + temp;
                        bookInventory.put(bookTitle,stock);
                        System.out.println(bookTitle + " 도서가 " + stock + " 권 으로 변경되었습니다.");
                    } else {
                        System.out.println("해당 도서가 재고에 없습니다.");
                    }
                    break;
                case 3:
                    Set<String> bookTitleSet = bookInventory.keySet();
                    List<String> bookTitles = new ArrayList<>();
                    bookTitles.addAll(bookTitleSet);
                    for (String book : bookTitles) {
                        System.out.println("도서명 : " + book + ", 현재 재고 : " + bookInventory.get(book));
                    }
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    endOfProgram = true;
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
