package ch11_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Array12 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] numbers = new Integer[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        int randomNum = random.nextInt(10);
        System.out.println(randomNum);
        /*
         random.nextInt();
         argument가 없을 떄는 가장 작은 정수부터 가장 큰 정수 중 하나를 임의 생성
         random.nextInt(한계값);

         */
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers, Comparator.reverseOrder());

        for (Integer number : numbers) {
            number = random.nextInt(10) + 1;
            number *= 10;
            System.out.print(number + " / ");
        }

    }
}
