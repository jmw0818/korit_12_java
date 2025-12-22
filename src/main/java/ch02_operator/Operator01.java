package ch02_operator;

public class Operator01 {
    public static void main(String[] args) {
        int i = 10;

        System.out.println(i);
        i = i + 1;
        System.out.println(i);

        int a = 5;
        int b = 2;
        System.out.println(a/b);
        double result = (double) a/b;
        System.out.println(result);

        int num1 = 1;
        System.out.println(num1);
        num1 += 2;
        System.out.println(num1);
        num1 -= 1;
        System.out.println(num1);
        num1 *= 10;
        System.out.println(num1);
        num1 /= 5;
        System.out.println(num1);

        System.out.println("---------------------------------");
        int j = 10;
        System.out.println(j);
        System.out.println(j++);
        System.out.println(j);
        System.out.println(++j);
        System.out.println(j);
        System.out.println(j--);
        System.out.println(j);
        System.out.println(--j);
        System.out.println(j);

        int age = 20;
        System.out.println("제 나이는 " + age + "살입니다.");
        System.out.println("내년에는 " + age + 1 + "살입니다.");
        System.out.println("내년에는 " + (age + 1) + "살입니다.");
        // 42, 43 차이점. 왜 안되는지 설명하라.
        // Operator02 클래스를 생성하시오.
    }
}
