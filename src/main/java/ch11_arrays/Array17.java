package ch11_arrays;

import java.util.Arrays;

public class Array17 {
    public static void main(String[] args) {
        int temp = 0;
        boolean duplicate;
        int cnt = 1;

        int[] lottoNums = new int[6];
        int round = 5;
        int [][] lottoNumSet = new int[round][6];

        for (int j = 0; j <round; j++) {
            for (int i = 0; i < lottoNums.length; i++) {
                duplicate = false;
                temp = (int) (Math.random() * 45) + 1;

                for (int k = 0; k < i; k++) {
                    if (lottoNums[k] == temp) duplicate = true;
                }
                if (!duplicate) {
                    lottoNums[i] = temp;
                    lottoNumSet[j][i] = temp;
                }
                else i--;
                cnt++;
            }
            System.out.println(Arrays.toString(lottoNums));
            System.out.println("반복 횟수 확인용 : " + cnt);
        }
        System.out.println("------ 최종 번호 ------");
        for (int i = 0; i<round; i++) {
            System.out.println(Arrays.toString(lottoNumSet[i]));
        }
    }
}
