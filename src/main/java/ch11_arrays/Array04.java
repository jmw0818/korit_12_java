package ch11_arrays;
/*
    main에서 사용하는 불특정 String[] 배열을 argument로 하는 메서드를 호출했을 떄,
    String[] 내부의 element들을 한 줄로 출력하는 method를 정의하는 것을 목표
 */

public class Array04 {
    public void printElement(String[] titles) {
        for (int i = 0; i < titles.length; i++) {
            System.out.print(titles[i] + " / ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[] titles = { "김일", "김이", "김삼"};
        Array04 array04 = new Array04();
        array04.printElement(titles);
    }
}
