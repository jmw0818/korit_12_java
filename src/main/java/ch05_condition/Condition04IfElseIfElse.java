package ch05_condition;
/*
    if - else if - else 문
    형식 :
    if (조건식 1) {
        실행문 1;
    } else if (조건식 2) {
        실행문 2;
    } else if (조건식 3) {
        실행문 3;
    } else {
        실행문 4;
    }
 */

import java.util.Scanner;

public class Condition04IfElseIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int point;
        final int VIP_POINT = 100;
        final int GOLD_POINT = 80;
        final int SILVER_POINT = 60;
        final int BRONZE_POINT = 40;

        String userGrade = "";
        System.out.print("포인트를 입력하세요 >>> ");
        point = scanner.nextInt();
        if (point > VIP_POINT) {
            userGrade = "VIP";
        } else if (point > GOLD_POINT) {
            userGrade = "GOLD";
        } else if (point > SILVER_POINT) {
            userGrade = "SILVER";
        } else if (point > BRONZE_POINT) {
            userGrade = "BRONZE";
        } else {
            userGrade = "NOMAL";
        }
        System.out.println("회원 등급 : " + userGrade);
    }
}
