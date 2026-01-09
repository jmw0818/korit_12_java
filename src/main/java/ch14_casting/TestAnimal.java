package ch14_casting;

public class TestAnimal {
    public Animal[] animalArray;

    public TestAnimal(Animal[] animalArray) {
        this.animalArray = animalArray;
    }

    public void sound() {
        System.out.println("동물이 소리를 낸다");
    }

    public void showInfo() {
        System.out.println(animalArray[0]);
    }
}
