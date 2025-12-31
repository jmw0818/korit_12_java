package ch11_arrays;

public class Array01 {
    public static void main(String[] args) {
        int[] arr01 = { 1,2,3,4,5 };
        System.out.println(arr01);

        // 이상의 코드를 실행해봤을 떄, 배열 내부의 값을 확인할 수 없습니다.
        // @를 고려했을 때 주소지만 출력됩니다.

        // element를 확인하기 위해서는 배열 내부로 직접 탐색하는 과정이 필요
        System.out.println(arr01[0]);
        System.out.println(arr01[1]);
        System.out.println(arr01[2]);
        System.out.println(arr01[3]);
        System.out.println(arr01[4]);

        for (int i = 0; i< arr01.length; i++) { // 배열명.length; <-> 문자열테이터.length();
            System.out.print(arr01[i]+ " ");
        }
        /*
            빈 배열 생성
            자료형1[] 배열명 = new 자료형1[개수];
            -> 미리 방의 개수를 지정을 해줘야 하는 한계가 있다.
         */
        System.out.println();
        int[] arr03 = new int[10];
        System.out.println(arr03[0]);   // int로 선언했기 떄문에 초기화를 하지 않았다면 0

        arr03[0] = 10;
        System.out.println(arr03[0]);

        int[] arr04 = new int[40];
        for (int i = 0; i < arr04.length; i++) {
            arr04[i] = i+41;
            System.out.print(arr04[i] + " / ");
        }
        System.out.println();

        String[] arr05 = {"안", "녕", "하", "세", "요" };
        for (int i = 0; i < arr05.length; i++) {
            System.out.print(arr05[i]);
        }
    }
}
