package ch06_loops;
/*
    중첩 while문 (Nested - while)
    형식 :
    while (조건식 1) {
        반복 실행문 1-a;
        while (조건식 2) {
            반복 실행문 2;
        }
        반복 실행문 1-b;
    }
    1일차 1교시입니다.
    ...
    1일차 3교시입니다.
    ...
    5일차 1교시입니다.
    ...
    5일차 3교시입니다.
 */

public class Loop03While2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            int j = 0;      // 위치 중요함.
            while (j < 3) {
                System.out.println((i+1) + "일차 " + (j+1) + "교시입니다.");
                j++;
            }
            i++;
        }
    }
}
