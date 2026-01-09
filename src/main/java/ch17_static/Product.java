package ch17_static;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {
    private String name;
    private int instanceCnt = 0;        // 2개의 field는 객체가 생성될 때 초기화됨.

    @Setter
    @Getter
    private static int cnt = 0;
    @Getter     // 정적 변수 레벨에는 추가적으로 적용해야 함.
    private static String title = "제품입니다.";

    public Product() {
        System.out.println("Product 클래스의 객체가 생성되었습니다.");
        instanceCnt++;
        cnt++;
    }

    public void increaseInstanceCnt() {
        System.out.println("현재 : " + getInstanceCnt() + " 에서 " + (++instanceCnt) + "로 증가되었습니다.");
    }
}
