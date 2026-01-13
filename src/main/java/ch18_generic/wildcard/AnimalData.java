package ch18_generic.wildcard;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AnimalData<T> {
    private T animal;
    /*
        현재 AnimalData의 field인 animal에 Animal 클래스의 상속을 받은
        Tiger / Human 객체를 field에 대입할것임.

        하지만 T에는 어떠한 클래스도 들어갈 수 있기 때문에 현재 상황에서는
        Car 클래스의 객체도 animal에 들어갈 수 있는 상황.

        이번 목표는
        특정 클래스라면 (즉 Animal 클래스의 상속을 받은 서브 클래스라면)
        해당 클래스에 맞는 객체 정보를 출력하도록 작성할 것임.
     */

    public void showData() {
        ((Animal) animal).move();   // T에 아무 클래스나 들어갈 수 있으니
        // (Animal) 부분은 Animal로 형변환을 시켜줄 것임.
        // Animal 의 서브 클래스가 아니라면 오류를 발생시키는 코드를 작성함. (ex. Car)
        if (animal.getClass() == Human.class) { // getSimpleName과 같은 맥락
            ((Human) animal).read(); // 현재 field에 들어간 animal 객체의 클래스를 확인하여
            // Human이라면 고유 메서드 read() 호출
        } else if(animal.getClass() == Tiger.class) {
            ((Tiger) animal).hunt();
        } else {
            System.out.println("아직 고유 메서드가 없거나 Animal의 서브 클래스가 아닙니다.");
        }
    }
}
