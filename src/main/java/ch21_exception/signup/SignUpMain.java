package ch21_exception.signup;

import java.util.Scanner;

public class SignUpMain {
    public static void checkId(String id) throws InvalidIdException{
        if (id.length() < 8) {
            throw new InvalidIdException("아이디는 8자 이상이어야 합니다." + id.length());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("생성할 아이디를 입력하세요 >>> ");
        try {
            String id = scanner.nextLine().trim();  // 스페이스바 제거 .trim()
            // 중간 스페이스바 제거 .replace(" ", "")
            checkId(id);
            System.out.println("사용가능한 아이디입니다.");
        } catch (InvalidIdException e) {
            System.out.println("오류 메시지 : " + e.getMessage());
        }
    }
}
