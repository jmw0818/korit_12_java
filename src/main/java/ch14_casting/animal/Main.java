package ch14_casting.animal;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.makeSound();   // 개가 짖습니다.
        dog1.fetch();       // 강아지가 공을 물어옵니다.

        // 업캐스팅 #1  (A a = b)
        Animal animal1 = dog1;  // animal1.fetch()가 없음 -> 그렇담 animal인가?
        animal1.makeSound();    // 결과값 : 개가 짖습니다. -> ??? dog인것 같은데? 재정의된 method가 호출.

        // 업캐스팅 #2  (A a = new B) -> b = new B
        Animal animal2 = new Dog(); // animal2.fetch()가 없음
        animal2.makeSound();    // 결과값 : 개가 짖습니다.

        /*
            클래스A 객체명 = new 클래스B();를 통해 객체를 생성했을 경우
            1. Override가 적용된 메서드, 즉 자식 클래스의 메서드가 호출됨 (클래스B의 메서드라는 의미)
            2. 클래스B(자식 클래스)의 고유 메서드는 호출 불가능.

            재정의된 method 버전으로 호출이 된다면 애초에
            클래스B 객체명 = new 클래스B();로 생성하면 재정의된 method도 호출되고, 고유 method도 호출할 수 있지 않나?
         */

        Animal animal0 = new Cat();
        animal0.makeSound();
        animal1.makeSound();

        // Animal이라는 배열 안에는 Animal 자료형이 들어간다. Dog, Cat은 불가능
        // 그렇다면 Animal이라는 배열 안에 Dog와 Cat을 관리하고 싶다면?

        // 연산자 instanceof 사용 예시
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1);
        boolean result2 = animal1 instanceof Dog;
        System.out.println(result2);

        //
        boolean result3 = dog1 instanceof Animal;
        System.out.println(result3);
        boolean result4 = animal2 instanceof Dog;
        System.out.println(result4);

        Animal animal3 = new Animal();
        boolean result5 = animal3 instanceof Animal;
        System.out.println(result5);
        boolean result6 = animal3 instanceof Dog;
        System.out.println(result6);

        System.out.println("↑ 업캐스팅 파트 : 객체명.메서드명(); 했을 때 자기 버전이 나오는지 재정의 버전이 나오는지 주목");
        System.out.println("↓ 다운캐스팅 파트");
        /*
            다운캐스팅은 명시적으로 이루어져야 한다.
            방법
            (클래스명) 객체명; -> (int)1.23; 과 같은 방식. conversion의 객체 버전
            그래서 기본 자료형의 형변환에서 벗어나서 참조 자료형까지 고려해야 함.
         */

        // 다운캐스팅 방법
        Dog dog2 = (Dog) animal2;
        // 위에 Animal animal2 = new Dog();로 생성했기 때문에 animal2의 Dog 버전 객체명이 아예 없음.
        // 근데 다운캐스팅 하면서 dog2라고 하는 객체명을 생성했음.
        animal2.makeSound();
        dog2.makeSound();
        dog2.fetch();

        /*
            dog2로 새로운 객체명을 선언하고 거기에 명시적 참조자료형 캐스팅을 적용하여
            Animal 클래스의 인스턴스인 animal2를 Dog 자료형으로 다운캐스팅 하였음.
            중요한 점은 다운캐스팅을 했다고 animal2가 사라지는 것은 아님
            dog2와 animal2가 별개로 움직인다고 봐야함.
            dog2로 메서드를 호출할 경우 당연히 재정의된 makeSound() (개가 짖습니다)가 출력되며,
            고유 메서드인 fetch() 역시 호출이 가능.

            그렇다면 Dog dog0 = new Dog(); 로 만들면 애초에 재정의된 메서드 및 고유 메서드를 사용할 수 있다는
            점이 문제가 된다.
         */
        // Animal animal3 = new Animal(); 로 생성했었음
//        Dog dog3 = (Dog) animal3;   // 다운캐스팅 시점에서 오류가 발생
        System.out.println(animal3 instanceof Dog);     // 확인 결과 Dog의 인스턴스가 아님(false). -> 오류발생
//        dog3.makeSound();

        Animal animal4 = new Dog();
        // 와 같은 방식으로 선언된 클래스와 호출되는 생성자가 달라야 한다. (그리고 둘은 상속관계)
        // 코드 작성시 이 부분은 오류(빨간줄)로 알려주지 않음
        // 이 문제를 해결하기 위한 방법 : instanceof 연산자이다. (81줄 or 88줄 이하)
        System.out.println("animal4 검증 (안전한 다운캐스팅 방식)");
        if (animal4 instanceof Dog) {       // 이 조건식이 true라면 animal4의 생성시 호출된 생성자는 Dog()라는 의미
            animal4.makeSound();            // 그러므로 animal4.makeSound()를 호출했을 때의 결과값은 개가 짖습니다.
            // 근데 fetch도 호출하고 싶다면
            Dog dog4 = (Dog) animal4;
            dog4.fetch();
        } else if (animal4 instanceof Cat) {
            Cat cat0 = (Cat)animal4;
            cat0.makeSound();
            cat0.udadada();
        }
    }
}
