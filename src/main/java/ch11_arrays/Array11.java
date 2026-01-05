package ch11_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/*
    random.nextInt();를 한번 써봤습니다.
    Integer[] numbers 배열을 선언하고 10개 짜리 index로 만듭니다.
    0번지부터 9번지까지 nextInt();를 반복 실행하여
    numbers 내에 임의의 정수를 넣어주겠습니다.
    그리고 그 배열 출력
    오름차순
    내림차순
 */
public class Array11 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] numbers = new Integer[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("오름차순 정렬 후 : " + Arrays.toString(numbers));
        Arrays.sort(numbers, Comparator.reverseOrder());
        System.out.println("내림차순 정렬 후 : " + Arrays.toString(numbers));

        for (Integer number : numbers) {
            System.out.print(number * 10 + " / ");
        }
        System.out.println();
    }
}
