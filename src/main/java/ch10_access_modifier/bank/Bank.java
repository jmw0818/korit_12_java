package ch10_access_modifier.bank;

public class Bank {
    private int accountNum;
    private String accountHolder;
    private int balance;
    private int pinNumber;

    public Bank() {
    }

    public Bank(int accountNum) {
        this.accountNum = accountNum;
    }

    public Bank(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public Bank(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("불가능한 잔액입니다.");
        }
    }

    public Bank(int accountNum, String accountHolder, int balance, int pinNumber) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("불가능한 잔액입니다.");
        }
        if (pinNumber >= 0 && pinNumber < 10000) {      // pinNumber 범위
            this.pinNumber = pinNumber;
        } else {
            System.out.println("불가능한 비밀번호입니다.");
        }

    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("불가능한 잔액입니다.");
        }
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        if (pinNumber >= 0 && pinNumber < 10000) {
            this.pinNumber = pinNumber;
        } else {
            System.out.println("불가능한 비밀번호입니다.");
        }
    }

    public void deposit(int amount, int inputPin) {
        if (inputPin == pinNumber) {
            if (amount > 0) {
                int currentBalance = this.getBalance() + amount;
                this.setBalance(currentBalance);
                System.out.println(amount + "원이 입금되었습니다. 현재 잔액 : " + currentBalance + "원");
            } else {
                System.out.println("불가능한 입력 금액입니다.");
            }
        } else {
            System.out.println("비밀번호가 틀렸습니다.");
        }
    }

    public void withdraw(int amount, int inputPin) {
        if (inputPin == pinNumber) {
            if (amount > 0) {
                if (balance - amount < 0) {
                    System.out.println("잔액이 부족하여 출금할 수 없습니다.");
                } else {
                    int currentBalance = this.getBalance() - amount;
                    this.setBalance(currentBalance);
                    System.out.println(amount + "원이 출금되었습니다. 현재 잔액 : " + currentBalance + "원");
                }
            } else {
                System.out.println("불가능한 입력 금액입니다.");
            }
        } else {
            System.out.println("비밀번호가 틀렸습니다.");
        }
    }

    public void showAccountInfo() {
        System.out.println();
        System.out.println("계좌 번호 : " + accountNum);
        System.out.println("계좌 소유자 : " + accountHolder);
        System.out.println("현재 잔액 : " + balance + "원");
    }
}
