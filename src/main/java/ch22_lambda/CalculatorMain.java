package ch22_lambda;

public class CalculatorMain {
    public static int operate(int a, int b, Calculator c) {
        return c.compute(a, b);
    }

    public static void main(String[] args) {
        // 정의한 interface Calculator를 활용 (람다식으로)
        Calculator add = (x, y) -> x + y;   // Calculator 인터페이스의 객체명이 add이고, 내부 메서드는 compute() 추상 메서드를 x + y 로 구현함
        Calculator sub = (x, y) -> x - y;
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> x / y;

        System.out.println("2 + 3 = " + operate(2, 3, add));
        /*
            operate의 세 번째 매개변수는 Calculator 인터페이스의 서브 클래스를 받음.
            그리고 operate() 메서드의 return 값은 기본적으로 compute()를 리턴
            하지만 인터페이스는 추상 메서드 밖에 없으니 구현부가 있는 객체값을 확인해야 함
         */
        System.out.println(sub.compute(3, 4));      // 객체를 통한 호출
        System.out.println(operate(4, 5, mul));     // 정적 메서드를 통한 호출
        /*
            클래스들 간의 일반 메서드 / 정적 메서드 뿐만 아니라
            함수형 인터페이스의 추상 메서드를 구현한 것을 (표현식으로 썼든 람다식으로 썼든)
            어떻게 호출할지 알아야 함.
         */
    }

}
