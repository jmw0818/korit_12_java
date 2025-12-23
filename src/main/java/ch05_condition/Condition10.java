package ch05_condition;
/*
    삼항 연산자 : 조건식을 평가하여 true / false에 따라 두 가지 표현식 중 하나를 선택적으로 실행

    형식 :
    조건식 ? 표현식 1 : 표현식 2

    조건식 : true / false로 평가 가능한 식
    표현식 1 : 조건식이 true일 때 실행되는 식
    표현식 2 : 조건식이 false일 때 실행되는 식
 */

import java.util.Scanner;

public class Condition10 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int max;
        max = a > b ? a : b;
        System.out.println("max에 저장된 값 : " + max);

        Scanner scanner = new Scanner(System.in);
        System.out.print("연도를 입력하세요 >>> ");
        int year = scanner.nextInt();
//        boolean isLeapYear = ( year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//        String result = isLeapYear ? "윤년입니다." : "윤년이 아닙니다.";
//        System.out.println(year + "년은 " + result);

        String result2 = "";
        boolean isLeapYear2 = ( year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (year < 0) {
            result2 = "불가능한 연도 입력입니다.";
        } else {
            result2 = isLeapYear2 ? "윤년입니다." : "윤년이 아닙니다.";
        }
        System.out.println(year + "년은 " + result2);

        String result3 = year < 0 ? "불가능한 연도 입력입니다." :
            ( year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ?
                        "윤년입니다." : "윤년이 아닙니다.";
        System.out.println(year + "년은 " + result3);



    }
}
