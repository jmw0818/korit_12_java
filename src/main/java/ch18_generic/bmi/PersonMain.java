package ch18_generic.bmi;

import ch14_casting.animal.Dog;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("김일", 168, 65);
        Bmi bmi = new Bmi();
        bmi.printResult(person1);


//        Dog dog1 = new Dog("강아지", 52, 12);
//        bmi.printResult(dog1);
        // 두 줄은 오류가 생긴다. printResult() 메서드를 override 하는 방법 -> generic
    }
}
