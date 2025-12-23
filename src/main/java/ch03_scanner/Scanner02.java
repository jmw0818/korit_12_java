package ch03_scanner;

import java.util.Scanner;
/*
    1. 다음과 같이 콘솔에 출력될 수 있도록 코드를 작성하시오.
    나이를 입력하세요 >>> 19
    저는 올해 19살입니다.
    내년에는 20살이 됩니다.
 */

public class Scanner02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("나이를 입력하세요 >>> ");
////        int age = scanner.nextInt();
////        System.out.println("저는 올해 " + age + "살입니다.");
////        System.out.println("내년에는 " + (age + 1) + "살이 됩니다.");
        /*
            2. 다음과 같이 콘솔에 출력될 수 있도록 코드를 작성하시오.
            점수를 입력하세요 >>> 4.5
            이름을 입력하세요 >>> 김일
            김일 학생의 점수는 4.5입니다.
         */
        System.out.print("점수를 입력하세요 >>> ");
        double score = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();           // 26라인을 쓰지않고 next로 변경해도 됨.
        System.out.println(name + " 학생의 점수는 " + score + "입니다.");


    }
}

