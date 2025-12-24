package ch06_loops;
/*
    for 반복문 (for loop)
    : 대부분의 경우 횟수가 고정되어 있을 때 사용하는 반복문

    무엇을 기준으로 for / while을 선택하는가?
    : 횟수를 기준으로 특정 반복횟수가 되었을 때 반복을 정지하고 싶다면 - for
    : 몇 번이나 진행될지 모르지만 특정 상태가 되었을 때 반복을 정지하고 싶다면 - while

    형식 :
    for (시작값; 종료값; 증감값) {
        반복 실행문;
    }
 */

public class Loop04For {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 1부터 100까지의 합을 구하시오. (for문과 while)
        int sum = 0;
        for (int j = 1; j < 101; j++) {
            sum += j;
        }
        System.out.println(sum);

        sum = 0;
        int k = 1;
        while (k < 101) {
            sum += k;
            k++;
        }
        System.out.println(sum);
    }


}
