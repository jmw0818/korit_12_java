package ch11_arrays;

public class Array09EnhancedFor {
    public static void main(String[] args) {
        String[] persons = {"김일", "김이", "김삼", "김사", "김오" };
        for (int i = 0; i < persons.length; i++) {
            System.out.println(i+1 + " 번 : " + persons[i]);
        }
        System.out.println();
        int num = 1;
        for (String person : persons) {
            System.out.println(num++ + " 번 : " + person);
        }
    }
}
