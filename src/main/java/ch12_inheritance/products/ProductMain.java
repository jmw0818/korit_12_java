package ch12_inheritance.products;

public class ProductMain {
    public static void main(String[] args) {
        Item item = new Item("일반 상품", "일반 카테고리");
        System.out.println("이 상품은 " + item.getName() + "입니다.");
        System.out.println("이 상품은 " + item.getCategory() + "입니다.");

        Product product1 = new Product("전자제품", "가전 제품", 100000, 10);
        product1.setCategory("백색 가전 제품");
        System.out.println("해당 제품은 " + product1.getCategory() + "입니다.");

        System.out.println("이름 : " + product1.getName());
        System.out.println("카테고리 : " + product1.getCategory());
        System.out.println("가격 : " + product1.getPrice() + "원");
        System.out.println("재고 : " + product1.getStock() + "개");

    }
}
