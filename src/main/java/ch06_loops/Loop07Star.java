package ch06_loops;
/*
    for (시작값; 한계값; 증감값) {
        반복 실행문 1-a;
        for (시작값; 한계값; 증감값) {
            반복 실행문2;
        }
        반복 실행문 1-b;
        for (시작값; 한계값; 증감값) {
            반복 실행문3;
        }
        반복 실행문 1-c;
    }
    *
    **
    ***
    ****
    *****
 */
public class Loop07Star {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        for (int i = 1; i < 6; i++) {
            for (int j = 6 - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
