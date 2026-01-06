package ch12_inheritance;

public class Human extends Animal{

    public Human() {
        System.out.println("사람 객체가 생성되었습니다.");
    }

    public void read (String title) {
        System.out.println(getAnimalName() + "이 " + title + "를 읽는 중입니다.");
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("사람이 두 발로 걷습니다.");
    }
}
