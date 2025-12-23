package ch05_condition;
/*
    조건문
    1. if 문 : if 다음에 있는 ( ) 내의 조건식이 true일 때 { } 내의 실행문이 실행됨.
        false면 실행되지 않는다.

    형식 :
    if (조건식) {      조건식 :  true / false로 결론이 날 수 있는 식 또는 문장
        실행문;        true일 때 실행
    }
 */

import java.util.Scanner;

public class Condition01 {
    public static void main(String[] args) {
        int num1 = 10;

        if (num1 > 0) {
            System.out.println("num1은 양수입니다.");
        }

        if (num1 > 15) {
            System.out.println("num1은 15 초과입니다.");
        }

        System.out.print("정수를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);

        int num2 = scanner.nextInt();

        if (num2 > 0) {
            System.out.println("num1은 양수입니다.");
        }

        if (num2 > 15) {
            System.out.println("num1은 15 초과입니다.");
        }

    }
}
