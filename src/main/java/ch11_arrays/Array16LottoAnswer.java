package ch11_arrays;

import java.util.Arrays;

public class Array16LottoAnswer {
    public static void main(String[] args) {
        int[] lottoNums = new int[6];
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < lottoNums.length; i++) {
                lottoNums[i] = (int) (Math.random() * 45 + 1);
            }
            Arrays.sort(lottoNums);
            System.out.println(Arrays.toString(lottoNums));
        }
    }
}
