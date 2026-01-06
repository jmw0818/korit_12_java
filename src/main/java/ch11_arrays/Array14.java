package ch11_arrays;

import java.util.Arrays;

public class Array14 {
    public static void main(String[] args) {
        int [][] nums = new int[20][5];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j<nums[i].length; j++) {
                nums[i][j] = (i * 5) + j + 1;
            }
        }
        for (int[] row : nums) {
            System.out.println(Arrays.toString(row));
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j<nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        // 다차원 배열을 출력하는 방식
        System.out.println(Arrays.deepToString(nums));

    }
}
