package ch11_arrays;

import java.util.Arrays;

public class Array07 {
    private String getGrade(int score) {
        String grade = "";
        if (score < 0 || score > 100) return grade;
        else {
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
        return grade;
    }
    public static void main(String[] args) {
        int[] scores = { 100, 97, 83, 85, 77, 76, 64, 64, 58, 59, 92, 100 };
        int aNum = 0, bNum = 0, cNum = 0, dNum = 0, fNum = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 0 || scores[i] > 100) break;
            else {
                if (scores[i] >= 90) {
                    aNum++;
                } else if (scores[i] >= 80) {
                    bNum++;
                } else if (scores[i] >= 70) {
                    cNum++;
                } else if (scores[i] >= 60) {
                    dNum++;
                } else {
                    fNum++;
                }
            }
        }
        System.out.println("A 등급 " + aNum + " 명");
        System.out.println("B 등급 " + bNum + " 명");
        System.out.println("C 등급 " + cNum + " 명");
        System.out.println("D 등급 " + dNum + " 명");
        System.out.println("F 등급 " + fNum + " 명");

        int[] gradeNum = new int[5];
        String[] grades = new String[scores.length];
        Array07 array07 = new Array07();
        for (int i = 0; i < scores.length; i++) {
            String grade = array07.getGrade(scores[i]);
            grades[i] = grade;
        }
//        for (int i = 0; i < grades.length; i++) {
//            System.out.println(grades[i] + " 등급 " + gradeNum[i] + " 명");
//        }
        System.out.println(grades[0].equals("A"));
    }



}
