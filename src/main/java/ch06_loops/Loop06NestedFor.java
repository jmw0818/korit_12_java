package ch06_loops;

import java.util.Scanner;

/*
    중첩 for문 (Nested for)
    for (int i = 0; i < 100; i++) {
        반복 실행문 1-a;
        for (int j = 0; j < 100; j++) {
            반복 실행문 2;
        }
        반복 실행문 1-b;
    }
    for 문을 활용하여 1일차 1교시입니다. ~ 5일차 3교시입니다.까지 출력하시오.
    다하면 구구단 for문으로 출력하시오
 */
public class Loop06NestedFor {
    public static void main(String[] args) {
//        for (int i = 1; i < 6; i++) {
//            for (int j = 1; j < 4; j++) {
//                System.out.print(i + "일차 " + j + "교시 입니다. ");
//            }
//            System.out.println();
//        }
//        for (int k = 2; k < 10; k++) {
//            for (int l = 1; l < 10; l++) {
//                System.out.print(k + " X " + l + " = " + (k*l) + " | ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i < 101; i++) {
//            System.out.print(i + " ");
//            if (i % 10 == 0) {
//                System.out.println();
//            }
//        }
//        for (int j = 0; j < 100; j+=10) {
//            for (int k = 1; k < 11; k++) {
//                System.out.print(j+k + " ");
//            }
//            System.out.println();
//        }
        // 숫자를 입력 받아서 홀수만 더하는 for 반복문을 작성하시오. (짝수도)
        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 몇 까지 더하시겠습니까? >>> ");
        int num = scanner.nextInt();
        int sumodd = 0;
        int sumeven = 0;
        for (int i = 1; i < num +1; i++) {
            if (i % 2 != 0) {
                sumodd += i;
            }
            else sumeven += i;
        }
        System.out.println("1부터 " + num + "까지 중 홀수의 합은 " + sumodd);
        System.out.println("1부터 " + num + "까지 중 짝수의 합은 " + sumeven);


    }
}
