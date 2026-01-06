package ch12_inheritance.products;
/*
    부모 - 자식의 상속 관계가 성립되어 있을 때,
    부모 클래스에서 기본 생성자 없이 매개변수 생성자만 있다면,
    자식 클래스에서 완벽한 기본 생성자를 만드는 것이 '불가능'하다.

    자식 클래스의 객체를 생성 시 필수적으로 '부모 클래스의 생성자를 호출'하기 때문

    A a = new A();
    A a = new B();
 */

public class Product extends Item{
    private int price;
    private int stock;

    public Product(String name, String category, int price, int stock) {
        super(name, category);
        this.price = price;
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
