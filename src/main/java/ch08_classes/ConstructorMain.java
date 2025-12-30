package ch08_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor constructor1 = new Constructor();
        Constructor constructor2 = new Constructor(2);
        Constructor constructor3 = new Constructor(3);
        System.out.println(constructor1.num);
        System.out.println(constructor2.num);
        System.out.println(constructor3.num);
        // 아까 전에는 myCar 객체를 생성하고 그 다음에 빨강이라는 값을 color에
        // 대입했습니다.
        // 근데 잘 생각해보면 아니 만들면서 곧장 color는 빨강이라고 지정할 수 없는건가
        // 에 해당하는겁니다
        // Car myCar = new Car("빨강");

        Constructor constructor4 = new Constructor("김사");
        System.out.println(constructor4.name);
        Constructor constructor5 = new Constructor(5,"김오");
        System.out.println(constructor5.num);
        System.out.println(constructor5.name);

        constructor5.displayInfo();
    }
}