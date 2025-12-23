package ch06_loops;
/*
    while 반복문
    형식 :
    while (조건식) {
        반복 실행문
    }

    while 뒤에 나오는 (조건식)을 봤을 떄 if(조건식) 형태와 유사하다.
    즉, while( ) 내의 조건식이 true일 때, { }내의 실행문이 '반복적으로' 이루어진다.

    그래서 주의할 점은,
    while 내부의 조건식이 특정 시점에 false가 되도록 설계해야한다.

    false가 되는 시점을 지정해주지 않으면 true 상태가 계속 유지되어
    반복실행이 무한히 이루어진다. (무한루프)
 */

public class Loop01 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {
            System.out.println(i);  // 1부터 9까지 출력 후 10이 되면서 반복문이 끝난다.
            i++;
        }
        System.out.println(i);      // i가 10이 되어서 반복문이 멈춘상태
    }
}
