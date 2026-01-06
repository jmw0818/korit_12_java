package ch11_arrays;

import java.util.Arrays;
import java.util.Random;

public class Array15Lotto {
    public static void main(String[] args) {
        int[] lottoNumber = new int[6];
        Random random = new Random();
        for (int a = 0; a < 10; a++) {
            for (int i = 0; i < lottoNumber.length; i++) {
                int temp = random.nextInt(45)+1;
                for (int j = 0; j < i; j++) {
                    if (lottoNumber[j] == temp);
                }
                lottoNumber[i] = random.nextInt(45)+1;
            }
            System.out.println(Arrays.toString(lottoNumber));
        }

    }
}
