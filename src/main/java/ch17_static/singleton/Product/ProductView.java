package ch17_static.singleton.Product;

public class ProductView {
    // 정적 변수를 선언, 보통 싱글톤 패턴 정적 변수 이름 instance
    private static ProductView instance;
    public static int count = 1;

    private ProductView() {
        int cnt = 1;    // 객체 생성 시에 사용되는 field
        System.out.println(cnt + " 번 째 객체가 생성되었습니다.");
        cnt++;
        System.out.println("정적 변수를 참조하는 " + count + " 번 째 객체가 생성되었습니다.");
        count++;
    }

    public static ProductView getInstance() {
        if (instance == null) {
            instance = new ProductView();
        }
        return instance;
    }
}
