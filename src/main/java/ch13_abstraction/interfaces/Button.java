package ch13_abstraction.interfaces;
/*
    클래스는 단일 상속만 가능한데, 키워드는 extends
    인터페이스는 다중 상속(구현)이 가능합니다. 키워드는 implements
 */

public abstract class Button implements Press, Up, Down {

    @Override
    public void onDown() {}     // 일반 메서드입니다. { }가 있으니까, 안에 아무것도 안써뒀습니다.

    @Override
    public abstract void onPressed();    // 추상 메서드로 만들것임. -> Button클래스도 추상클래스가 됨.
    // Button 을 상속 받는 애들이 onPressed를 강제적으로 상속 받기 위해 추상메서드로 만들었음.
    // 나머지 UP, Down 은 필요에따라 달라짐.

    @Override
    public String onUp() {
        return "올립니다.";
    }
}
