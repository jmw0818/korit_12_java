package ch11_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
//        int num = scanner.nextInt();
//        scanner.nextLine();
//        String[] studentName = new String[num];
//        for (int i = 0; i < num; i++) {
//            System.out.print(i+1 + " 번 학생의 이름을 등록하세요 >>> ");
//            studentName[i] = scanner.nextLine();
//        }
//
//        double[] scores = new double[num];
//        for (int i = 0; i < num; i++) {
//            System.out.print(i+1 + " 번 학생의 점수를 입력하세요 >>> ");
//            scores[i] = scanner.nextDouble();
//        }
//        System.out.println("학생들의 점수 총합은 " + Arrays.stream(scores).sum() + "점입니다.");

        Array03Method array03Method = new Array03Method();
        array03Method.writeNameAndScore();
    }
}
