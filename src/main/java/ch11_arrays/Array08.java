package ch11_arrays;
/*
    향상된 for 문

    배열 내의 element에 for 문 내부에서 만 사용하는 변수에 대입하는 방식을 사용하여
    index 넘버의 사용 없이 적용할 수 있는 for 반복문

    제약 :
        읽기만 되고, 쓰기가 안됨.
    형식 :
    for( 자료형 변수명 : 반복가능객체(배열)) {
        반복실행문
    }
 */

public class Array08 {
    public static void main(String[] args) {
        int[] nums = new int[200];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+1;
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
//        System.out.println(num);    오류 발생.

        String[] names = {"김일", "김이", "김삼", "김사", "김오" };
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " / ");
        }
        System.out.println();
        for (String name : names) {
            System.out.print(name + " / ");
        }
        System.out.println();
    }
}
