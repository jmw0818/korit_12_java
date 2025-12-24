package ch06_loops;

import java.util.Scanner;

public class Loop05For2 {
    public static void main(String[] args) {
        // 1부터 100까지의 숫자 중 홀수 합만 구하는 for문을 작성하시오.
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 != 0) sum += i;
        }
        System.out.println(sum);

        int sum2 = 0;
        for (int j = 1; j < 101; j+=2) {
            sum2 += j;
        }
        System.out.println(sum2);

        // 숫자를 입력받아 1부터 n까지 더하는 반복문 작성
        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 몇까지 더하시겠습니까? >>> ");
        int num = scanner.nextInt();
        int sum3 = 0;
        for (int k = 1; k < num+1; k++) {
            sum3 += k;
        }
        System.out.println("1부터 " + num + "까지의 합은 " + sum3 + "입니다.");
    }
}
