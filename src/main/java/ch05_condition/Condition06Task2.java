package ch05_condition;

import java.util.Scanner;

public class Condition06Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 >>> ");
        int score = scanner.nextInt();
        scanner.nextLine();
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        char grade;
        if (score > 100 || score < 0){
            grade = 'X';
        } else if (score >= 90){
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else grade = 'F';
        System.out.println(name + " 학생의 점수는 " + score + "점이고, 학점은 " + grade + "입니다.");
    }
}
