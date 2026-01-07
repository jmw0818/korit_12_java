package ch13_abstraction.interfaces;

public interface Press {
    String NAME = "button";
    /*
        interface이기 때문에 변수 앞에 접근 제어자 명시할 필요 x
        final 키워드도 적을 필요가 없음
        하지만 기본적으로 public final이 생략되어있음

        아래는 안되는 예시
     */

//    int age;  //  field 선언 불가능
//    public Press() {};    // 생성자 정의 불가능
//    void popOut() {
//        System.out.println("일반 메서드를 정의해보았음");
//    }       // 인터페이스 상에서는 추상 메서드만 가능
        // 나머지 로직은 서브 클래스에서 '구현'해야 한다.

    // 가능한 예시
    void onPressed();       // call1() ~ call4() 중에 어느 유형이고 그 근거는 무엇인가? -> call1()

    /*
        Up interface 를 생성하고 onUp()이라는 추상 메서드를 정의하시오 -> call1()
        Down interface 를 생성하고 onDown()이라는 추상 메서드를 정의하시오
     */
}
