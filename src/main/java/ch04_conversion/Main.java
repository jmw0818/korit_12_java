package ch04_conversion;

public class Main {
    public static void main(String[] args) {
        // 1. upcasting(업캐스팅) : 더 큰 용량의 자료형으로 변환
        char cast1 = 'A';
        System.out.println("원형 : " + cast1);

        // 업캐스팅 방법 #1
        System.out.println("(int)변형 : " + (int)cast1);      // 결과값 : 65

        char cast2 = 'a';
        System.out.println("원형 : " + cast2);
        System.out.println("(int)변형 : " + (int)cast2);      // 결과값 : 97

        // 업캐스팅 방법 #2
        char cast3 = 'b';
        int casted3 = cast3;
        System.out.println("원형 : " + cast3);
        System.out.println("변형(casted3) : " + casted3);

        // 2. downcasting(다운캐스팅) : 더 작은 용량의 자료형으로 변환
        int cast4 = 99;
        int cast5 = 100;

        // 방법 #1
        System.out.println("원형 : " + cast4);
        System.out.println("(char)변형 : " + (char)cast4);

        // 방법 #2
        char casted5 = (char) cast5;
        System.out.println("원형 : " + cast5);
        System.out.println("변형(casted5) : " + casted5);

        /*
            다운캐스팅을 진행할 때, 업캐스팅 #2 방식으로 처리하면 오류가 남.
            why? 업캐스팅의 경우 메모리 용량이 커지면 되어서 기존 데이터의 변형이 일어날 가능성 없이
            임시적(implicit)으로 변형이 가능함.
            다운캐스팅의 경우 테이터 용량이 작아지는 과정에서 데이터가 메모리 용량을 벗어나게 되는 경우가 발생.
            그래서 미리 점검하기 위해 다운캐스팅 시에는 명시적(explicit)으로만 변경이 가능함.
         */

    }
}
