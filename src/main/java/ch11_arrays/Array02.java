package ch11_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        int num = scanner.nextInt();
        scanner.nextLine();
        String[] studentName = new String[num];
        for (int i = 1; i < num+1; i++) {
            System.out.print(i + " 번 학생의 이름을 등록하세요 >>> ");
            studentName[i-1] = scanner.nextLine();
        }

        double[] scores = new double[num];
        for (int i = 1; i < num+1; i++) {
            System.out.print(i + " 번 학생의 점수를 입력하세요 >>> ");
            scores[i-1] = scanner.nextDouble();
        }
        System.out.println("학생들의 점수 총합은 " + Arrays.stream(scores).sum() + "점입니다.");
    }
}
