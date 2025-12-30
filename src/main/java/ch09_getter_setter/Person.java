package ch09_getter_setter;

public class Person {
    String name;
    int age;
    String address;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        if (name.length() > 4 || name.length() < 1) {
            System.out.println("변경할 수 없습니다.");
            return; // method를 종료하는 명령어
        }
        System.out.println("이름이 변경되었습니다.");
        System.out.println("변경 전 : " + this.name);
        System.out.println("변경 후 : " + name);
        this.name = name;
    }
    public void setAge(int age){
        if (age < 0 || age > 200) {
            System.out.println("불가능한 나이 입력입니다.");
            this.age = 0;
        }else {
            this.age = age;
        }
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
}
