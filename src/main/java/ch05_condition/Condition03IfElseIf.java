package ch05_condition;

import java.util.Scanner;

/*
    3. if - else if 문 : if - else 문과 달리 else if에는 별도의 조건식이 요구된다.
        그리고 else if는 복수로 작성 가능하다.

    형식 :
    if (조건식 1) {
        실행문 1;
    } else if (조건식 2) {
        실행문 2;
    } else if (조건식 3) {
        실행문 3;
    }

 */
public class Condition03IfElseIf {
    public static void main(String[] args) {
        // 사용되는 클래스를 먼저 쓰는 편
        Scanner scanner = new Scanner(System.in);

        // 사용되는 변수 / 상수를 선언 및 초기화 (하는 경우도 있고 선언만하는 경우도 있음)
        int point;
        // 상수 : final 키워드 (재대입 불가능)
        final int VIP_POINT = 100;  // 변함없는 데이터를 사용하고 싶을 때
        final int GOLD_POINT = 80;  // 사용하는데, 변함 없는 데이터임을
        final int SILVER_POINT = 60;// 쉽게 알아보기 위해
        final int BRONZE_POINT = 40;// snake_case를 활용하여 대문자로만 작성.
                                    // 띄어쓰기는 '_' 사용.

        // 풀이법 #1
        System.out.print("포인트를 입력하세요 >>> ");
//        point = scanner.nextInt();
//        if (point > VIP_POINT) {
//            System.out.println("회원 등급 : VIP");
//        } else if (point > GOLD_POINT) {
//            System.out.println("회원 등급 : GOLD");
//        } else if (point > SILVER_POINT) {
//            System.out.println("회원 등급 : SILVER");
//        } else if (point > BRONZE_POINT) {
//            System.out.println("회원 등급 : BRONZE");
//        }

        // 풀이법 #2
        String userGrade = "";
        point = scanner.nextInt();
        if (point > VIP_POINT) {
            userGrade = "VIP";
        } else if (point > GOLD_POINT) {
            userGrade = "GOLD";
        } else if (point > SILVER_POINT) {
            userGrade = "SILVER";
        } else if (point > BRONZE_POINT) {
            userGrade = "BRONZE";
        }
        System.out.println("회원 등급 : " + userGrade);

        /*

         */
    }
}
