package ch12_inheritance;

public class Tiger extends Animal{  // Animal을 상속 받음
    private double weight;

    public Tiger() {
    }

    public Tiger(String animalName, int animalAge, double weight) {
        super(animalName, animalAge);       // 여기도 super 키워드가 있습니다.
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override   // 재정의
    public void move() {
        System.out.print("호랑이가 ");
        super.move();   // super.메서드명() / super 키워드 - 부모 클래스의 임의의 인스턴스를 의미함.
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void hunt() {
        System.out.println(getAnimalName() + "이(가) 사냥을 합니다.");
    }

    // 고유 메서드의 overload
    public void hunt(String prey) {
        System.out.println(getAnimalName() + "이(가) " + prey + "을(를) 사냥합니다.");
    }
}
