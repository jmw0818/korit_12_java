package ch15_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        ObjectTest object1 = new ObjectTest();
        object1.setName("김일");
        object1.setAddress("부산광역시 연제구");
        object1.showInfo();

        ObjectTest object2 = new ObjectTest("김이", "서울특별시 종로구");
        object2.showInfo();
        System.out.println(object1.toString());     // 객체명만으로의 결과값과 같음(toString()을 재정의 했을 때)
        System.out.println(object1);
        System.out.println("--------- equals() ----------");

        String example = "안녕하세요";

        boolean result1 = "안녕하세요" == example;
        System.out.println(result1);    // true로 나옴 ㅇㅇ
        String[] strArray = {"안녕하세요", "안녕"};
        boolean result2 = "안녕하세요" == strArray[0];
        boolean result3 = example == strArray[0];
        System.out.println(result2);    // true
        System.out.println(result3);    // true 다 나옴 ㅇㅇ -> 상관없는건가?
        ObjectTest test1 = new ObjectTest("안녕하세요","안녕");
        boolean result4 = "안녕하세요" == test1.getName();
        System.out.println(result4);    // true 인데?
        boolean result5 = strArray[0] == test1.getName();
        boolean result6 = example == test1.getName();
        System.out.println(result5);    // true
        System.out.println(result6);    // true ...

        String example2 = new String("안녕하세요");  // String example2 = "안녕하세요" 의 원형태
        boolean result7 = "안녕하세요" == example2;
        System.out.println(result7);    // false 드디어..  why? example2는 객체로 만듬

        String example3 = new String(example);
        boolean result8 = example3 == example;
        System.out.println(result8);    // false 객체에 대입한 변수와 비교했음에도 다름
        // 주소값에 상관없이 문자열 자체를 비교하고 싶을 땐 equals()를 사용하자

        boolean result71 = "안녕하세요".equals(example2);
        System.out.println(result71);   // equals()를 사용하니 true
        boolean result81 = example3.equals(example);
        System.out.println(result81);   // equals()를 사용하니 true

    }
}
