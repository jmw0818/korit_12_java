package ch06_loops;
/*
    몇 줄의 별을 생성하시겠습니까? >>> 3
    *
    **
    ***

    ***
    **
    *
    도 작성
 */

import java.util.Scanner;

public class Loop08Star2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 줄의 별을 생성하시겠습니까? >>> ");
        int num = scanner.nextInt();
        for (int i = 1; i < num+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        for (int i = 1; i < num+1; i++) {
            for (int j = 0; j < num+1 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        for (int i = 1; i < num+1; i++) {
            for (int j = 1; j < num+1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
