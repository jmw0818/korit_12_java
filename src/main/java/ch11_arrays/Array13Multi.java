package ch11_arrays;
/*
    다차원 배열 (Multi-Dimensional Array) 중에서 2차원 배열

    형식 :
    int[][] arr01 = new int[크기][크기];
    int[][] arr02 = new int[크기][];
    int[][] arr03 = { {1, 2}, {3, 4}, {5, 6} };
 */

import java.util.Arrays;

public class Array13Multi {
    public static void main(String[] args) {
        int[][] arr03 = { {1, 2}, {3, 4}, {5, 6} };
        System.out.println(arr03[2][0]);
        System.out.println(arr03[2]);

        for (int i = 0; i<arr03.length; i++) {
            for (int j = 0; j<arr03[i].length; j++) {
                System.out.print(arr03[i][j] + " / ");
            }
            System.out.println();
        }
        for (int i = 0; i<arr03.length; i++) {
            System.out.println(Arrays.toString(arr03[i]));
        }

        for ( int[] row : arr03) {
            for ( int num : row) {
                System.out.print(num + " - ");
            }
            System.out.println();
        }
    }

}
