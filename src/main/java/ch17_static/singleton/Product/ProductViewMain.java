package ch17_static.singleton.Product;

public class ProductViewMain {
    public static void main(String[] args) {
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();

        System.out.println(ProductView.count);
        System.out.println(ProductView.getInstance());
        /*
            이상의 코드에서 다양하게 검증했을 때 알 수 있는 점은
            getInstance() 메서드는 생성자를 호출하는 method이기 때문에
            기본적으로 호출 횟수만큼 객체가 생성되어야 한다.
            그러나 내부에 조건물을 통해 하나의 객체라도 생성되어있다면
            해당 객체를 return하게끔 작성되어있기 때문에
            결과적으로 생성자가 호출되는 횟수는 1로 고정된다.
         */
    }
}
