package ch08_classes;
/*
    Car의 인스턴스인 myCar라는 객체를 생성하시오.
    color 빨강, speed에 160을 대입하시오.
    yourCar에 노랑, 180을 대입하시오.
    myCar는 drive() 메서드를 호출
    yourCar는 brake() 메서드를 호출
    myCar, yourCar에 각각 displayInfo() 메서드를 호출하시오.
 */
public class CarMain {
    public static void main(String[] args) {
        // 객체 생성
        Car myCar = new Car();
        Car yourCar = new Car();
        // 필드에 값 대입
        myCar.color = "빨강";
        myCar.speed = 160;
        yourCar.color = "노랑";
        yourCar.speed = 180;

        myCar.drive();
        yourCar.brake();
        myCar.displayInfo();
        yourCar.displayInfo();
    }
}