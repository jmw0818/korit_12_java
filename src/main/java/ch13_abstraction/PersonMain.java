package ch13_abstraction;

public class PersonMain {
    public static void main(String[] args) {
        Student student1 = new Student("김일", "코리아아이티대학교");
        System.out.println(student1.getName().length());

    }
}
