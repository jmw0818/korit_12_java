package ch17_static;

public class ProductMain {
    public static void main(String[] args) {
        System.out.println(Product.getTitle());
        // 객체 생성을 하지 않았지만 title 정적변수를 불러올 수 있다.
        // 롬복 사용시 : 클래스 레벨에 @Getter가 있더라도
        // 정적 변수 레벨에 추가적으로 @Getter를 적용해야만 함.
        Product product1 = new Product();
        product1.setName("아이스아메리카노");
        System.out.println(product1.getName());
        System.out.println("일반 필드 조회 : " + product1.getInstanceCnt());
        System.out.println("정적 필드 조회 : " + Product.getCnt());

        Product product2 = new Product();
        System.out.println("일반 필드 조회 : " + product1.getInstanceCnt());
        System.out.println("정적 필드 조회 : " + Product.getCnt());
        Product.setCnt(0);
        System.out.println("재고를 초기화했습니다. 현재 재고 : " + Product.getCnt());

        product1.increaseInstanceCnt();
        System.out.println(product1.getInstanceCnt());
    }
}
