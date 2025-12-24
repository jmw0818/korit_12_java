package ch07_methods;

import java.util.Scanner;

public class Method03ScoreCalc2 {
    // method 정의 영역

    // 1. 합을 구하는 메서드 / 2. 평균을 구하는 메서드를 작성하고
    // 평균을 구하는 메서드 내에서 합을 구하는 메서드를 호출하는 방식으로 작성

    // 그리고 메서드 호출 영역에는 '평균을 구하는 메서드'만 호출할겁니다.

    public static double calcSum(int numOfSubs) {
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < numOfSubs+1; i++) {
            System.out.print(i + " 과목의 점수를 입력하세요. >>> ");
            sum += scanner.nextDouble();
        }
        return sum;
    }

    public static void calcAvg() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 개의 과목을 입력하시겠습니까? >>> ");
        int numOfSubs = scanner.nextInt();
        double sum = calcSum(numOfSubs);
        System.out.println("총합은 " + sum + "이며, 평균은 " + (sum / numOfSubs) + "입니다.");
    }


    public static void main(String[] args) {
        // method 호출 영역
        calcAvg();
    }
}
