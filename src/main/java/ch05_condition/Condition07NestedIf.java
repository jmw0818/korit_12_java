package ch05_condition;
/*
    5. 중첩 if문(Nested - if sentence) :
        if 문 내에 if 문이 중첩적으로 사용될 수 있습니다.

    형식 :
    if (조건식 1) {
        실행문 1-1;
        if (조건식 1a) {
            실행문 1a;
        } else if (조건식 1b) {
            실행문 1b;
        } else if (조건식 1c) {
            실행문 1c;
        } else {
            실행문 1d;
        }
        실행문 1-2;
    } (조건식 2) {
        실행문 2-1;
        if (조건식 2a) {
            실행문 2a;
        } else if (조건식 2b) {
            실행문 2b;
        } else if (조건식 2c) {
            실행문 2c;
        } else {
            실행문 2d;
        }
        실행문 2-2;
    } else {
        실행문 3;
    }
 */

import java.util.Scanner;

public class Condition07NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String grade = "";
        System.out.print("점수를 입력하세요 >>> ");
        score = scanner.nextInt();

        if (score > 100 || score < 0) {
            System.out.println("불가능한 점수 입력입니다.");
            grade = "X";
        } else {
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
        }
        System.out.println("당신의 점수는 " + score + "점이고, 등급은 " + grade + "입니다.");
    }
}
