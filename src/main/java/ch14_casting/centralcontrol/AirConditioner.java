package ch14_casting.centralcontrol;

public class AirConditioner implements Power{
    @Override
    public void on() {
        System.out.println("에어컨을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("에어컨을 끕니다.");
    }

    // 고유 메서드 (다운캐스팅을 위한)
    public void changeMode() {
        System.out.println("에어컨의 모드를 바꿨습니다.");
    }
}
