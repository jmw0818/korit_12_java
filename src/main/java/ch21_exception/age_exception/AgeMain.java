package ch21_exception.age_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    예외 클래스는 별개로 정의했지만 메서드를 호출했을 때
    예외를 처리해야 하기 때문에 특정 예외를 참조한다는 것을 명시해줘야 함
 */
public class AgeMain {
    public static void checkAge(int age) throws InvalidAgeException {
            if (age < 0 || age > 200) {
                throw new InvalidAgeException("나이는 0 ~ 200 사이의 정수만 가능합니다.");
            }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요 >>> ");
//        int age = scanner.nextInt();
        /*
            이전에는 이상의 코드에 바로 scanner 집어넣었음.
            하지만 예외가 발생할 수 있는 부분이 있으니 try-catch를 사용
         */
        try {
            int age = scanner.nextInt();
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("나이 입력 오류 : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("나이 입력 오류 : " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
