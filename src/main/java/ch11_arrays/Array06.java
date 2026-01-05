package ch11_arrays;

import java.util.Arrays;

public class Array06 {
    public double calcSum(int[] scores) {
        double sum = 0;
        sum = Arrays.stream(scores).sum();
        return sum;
    }

    public double calcAvg(int[] scores) {
        return calcSum(scores) / scores.length;
    }

    public void printSumAndAvg(int[] scores) {
        double sum = calcSum(scores);
        double avg = calcAvg(scores);
        System.out.println("총점 : " + sum + "점");
        System.out.println("평균 : " + avg + "점");
    }
    public double calcSum(double[] scores) {
        double sum = 0;
        sum = Arrays.stream(scores).sum();
        return sum;
    }

    public double calcAvg(double[] scores) {
        return calcSum(scores) / scores.length;
    }
    public void printSumAndAvg(double[] scores) {
        double sum = calcSum(scores);
        double avg = calcAvg(scores);
        System.out.println("총점 : " + sum + "점");
        System.out.println("평균 : " + avg + "점");
    }

    public static void main(String[] args) {
        int[] scores = { 100, 90, 80, 70, 60, 50, 40 , 30, 20, 10 };
        Array06 array06 = new Array06();
        array06.printSumAndAvg(scores);
    }
}
