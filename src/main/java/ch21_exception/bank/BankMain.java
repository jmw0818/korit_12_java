package ch21_exception.bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankMain {
    private int balance = 10000;

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            int gap = amount - balance;
            throw new InsufficientBalanceException("잔액이 부족합니다. (부족금액 : " + gap + "원)" );
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankMain bank = new BankMain();
        System.out.print("출금할 금액을 입력하세요 (현재 잔액 :" + bank.balance + "원) >>> ");
        try {
            int amount = scanner.nextInt();
            bank.withdraw(amount);
            bank.balance -= amount;
            System.out.println(amount + " 원이 출금되었습니다. (남은금액 : " + bank.balance + "원)");
        } catch (InsufficientBalanceException e) {
            System.out.println("출금 실패 : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("정수만 입력이 가능합니다.");
        } finally {
            System.out.println("프로그램 정상 종료");
        }
        System.out.println(bank.balance);
    }
}
