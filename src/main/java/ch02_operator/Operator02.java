package ch02_operator;
/*
    논리 연산자
    AND(&&) : 하나라도 false 면 false
    OR(||) : 하나라도 true 면 true
    Not(!) : 역전
 */

public class Operator02 {
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println("&& 연산자");
        boolean result1 = flag1 && flag1;
        System.out.println("T x T = " + result1);
        boolean result2 = flag1 && flag2;
        System.out.println("T x F = " + result2);
        boolean result3 = flag2 && flag2;
        System.out.println("F x F = " + result3);

        System.out.println("|| 연산자");
        boolean result4 = flag1 || flag1;
        System.out.println("T + T = " + result4);
        boolean result5 = flag1 || flag2;
        System.out.println("T + F = " + result5);
        boolean result6 = flag2 || flag2;
        System.out.println("F + F = " + result6);

    }
}
