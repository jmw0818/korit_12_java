package ch11_arrays;

public class Array05 {
    public void addPlus(String[] scores) {
        for (int i = 0; i < scores.length; i++) {
            if (i == scores.length-1) {
                System.out.print(scores[i]);
            } else {
                System.out.print(scores[i] + "+ / ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[] scores = {"A", "B", "C", "D", "F"};
        Array05 array05 = new Array05();
        array05.addPlus(scores);
    }
}
