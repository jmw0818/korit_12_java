package ch11_arrays;
/*
    배열의 출력
    Arrays 클래스를 사용하고, '정적' 메서드인 .toString(배열명)을 사용하면
    배열 전체를 출력할 수 있다.

    클래스명.메서드명() 이라는 점이 중요
    scanner.nextLine();의 경우 객체명.메서드명()이었는데 차이가 있다.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Array10PrintArray {
    public static void main(String[] args) {
//        Random random = new Random();   // 랜덤 클래스의 객체 생성
//        Scanner scanner = new Scanner(System.in);   // 스캐너 클래스의 객체 생성
//        int num1 = random.nextInt();
//        System.out.print("숫자를 입력하세요 >>> ");
//        int num2 = scanner.nextInt();
//        System.out.println(num1);
//        System.out.println(num2);
//        // 같은 method 명이면서도 어떤 클래스의 객체에서 호출하느냐에따라서 결과값이 다름
//        Random sc = new Random();
//        int num3 = sc.nextInt();
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.asList(numbers).toString());
        // chaning method로 toString()이 있음을 확인

        // # 1 Arrays.toString(배열명); : 배열의 출력
        // # 2 Arrays.sort(배열명); : 배열의 정렬 오름차순
        Integer[] nums = { 3,6,7,1,9,2,10,5,4,8};
        System.out.println("정렬 전 배열 : " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("오름 차순 정렬 후 배열 : " + Arrays.toString(nums));
//        System.out.println(Arrays.sort(nums));
        // 이상의 코드는 오류가 난다. sort의 return 타입이 void이기 때문.
        Arrays.sort(nums, Comparator.reverseOrder());   // 현재 오류가 발생함 int[]
        // nums를 Integer[]로 바꾸니까 오류가 사라졌음.

        System.out.println("내림 차순 정렬 후 배열 : " + Arrays.toString(nums));
    }
}
