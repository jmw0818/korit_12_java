package ch15_objects.teachers;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("안근수", "코리아아이티");
        Teacher teacher2 = new Teacher("안근수", "코리아아이티");
        System.out.println(teacher2);
        System.out.println(teacher1);

        boolean result1 = teacher1.equals(teacher2);
        System.out.println(result1);        // false가 뜨네요 ??
        // Teacher 클래스에 equals()를 재정의하니깐 true로 바뀌어있음..
        // -> 원래는 주소지를 비교하는거 였는데, 재정의로 내부 데이터만 비교하게 되었음.

        Class tClass = teacher1.getClass();
        System.out.println(tClass);     // 결과값 : class ch_15_objects.teachers.Teacher
        System.out.println(tClass.getSimpleName());
        System.out.println(teacher1.getClass().getSimpleName());

        Field[] fields = tClass.getDeclaredFields();
        System.out.println(fields);     // 배열이라 주소값이 출력
        // field확인 방법 1. 반복문 사용 / 2. Arrays를 사용
        for (int i = 0; i < fields.length; i++) {
            System.out.println("필드명 : " + fields[i].getName());
            System.out.println("패키지 명 + 클래스 명 : " + fields[i].getType());
            System.out.println("클래스 명 : " + fields[i].getType().getSimpleName() + "\n");
        }
        // Teacher라는 원본의 자료형이 아니라 field의 자료형을 의미함
        for (Field field : fields) {
            System.out.println("필드명 : " + field.getName());
            System.out.println("패키지 명 + 클래스 명 : " + field.getType());
            System.out.println("클래스 명 : " + field.getType().getSimpleName()+'\n');
        }
        System.out.println(Arrays.toString(fields));
        System.out.println();

        Method[] methods = tClass.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));
        for (Method method : methods) {
            System.out.println("메서드 명 : " + method.getName());
            System.out.println("리턴 타입 : " + method.getReturnType());
            System.out.println("");
        }

        ch15_objects.Teacher teacher3 = new ch15_objects.Teacher("안근수", "코리아아이티");

        boolean result2 = teacher1.equals(teacher3);
        System.out.println(result2);    // 결과값 : false
        /*
            teacher3의 자료형은 ch15_objects.Teacher이지
            ch15_objects.teachers.Teacher가 아니기 때문에 내부에 동일한 값이 들어가 있다고 하더라도
            false라는 결과값을 가지게 된다.
         */




    }
}
