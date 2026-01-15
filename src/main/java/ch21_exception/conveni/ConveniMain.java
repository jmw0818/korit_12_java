package ch21_exception.conveni;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConveniMain {
    public static void order(int quantity) throws InvalidOrderQuantityException {
        if (quantity < 1 || quantity > 50) {
            throw new InvalidOrderQuantityException("주문이 불가능합니다.");
        }
        System.out.println(quantity + "개 주문이 완료되었습니다.");    // try 내부에 있는걸 가져옴
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주문 할 수량을 입력하세요. >>> ");
        try {
            int quantity = scanner.nextInt();
            order(quantity);
//            System.out.println(quantity + "개 주문이 완료되었습니다.");
        } catch (InvalidOrderQuantityException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("정수만 입력할 수 있습니다.");
        } catch (Exception e) {
            System.out.println("알 수 없는 예외가 발생했습니다.");
        }
        finally {
            System.out.println("프로그램이 정상 종료되었습니다.");
        }

    }
}
