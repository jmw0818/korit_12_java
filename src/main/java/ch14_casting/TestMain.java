package ch14_casting;
public class TestMain {
    public static void main(String[] args) {
//        TestAnimal testAnimal = new TestAnimal();
//        testAnimal.sound();
//        TestDog testDog = new TestDog();
//        testDog.sound();

//        TestAnimal testAnimal1 = new TestDog();
//        testAnimal1.sound();

        TestAnimal testAnimal = new TestAnimal(new Animal[2]);
//        Animal[] animals = { new TestDog(), new TestCat()};
//        for (Animal animal : animals) {
//            animal.sound();
//        }
        testAnimal.sound();
    }
}
