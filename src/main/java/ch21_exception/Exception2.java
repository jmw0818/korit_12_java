package ch21_exception;

class LoginFailedException extends Exception {
    public LoginFailedException(String message) {
        super(message);
        System.out.println("로그인 시 예외가 발생하였습니다.");
    }
}
/*
    Exception(String message) {
        this.message = message;
    }
    라고 봐야할듯.
 */

public class Exception2 {
    public static void login(String id, String password) throws LoginFailedException {
        String correctId = "admin";
        String correctPassword = "1q2w3e4r!!";
        // 특정 메서드에서 예외가 발생하는 것을 지정하고 싶다면 throws 명령어를 입력해야 함
        if (!id.equals(correctId) || !password.equals(correctPassword)) {
            throw new LoginFailedException("ID 또는 PW가 틀렸습니다.");
            // throw : 명령문이다. LoginFailedException() 생성자에 String argument를 집어넣어서 객체를 생성했는데,
            // 그 객체를 던지라는 의미로 해석할 수 있음.
        }
    }

    public static void main(String[] args) {
        String inputId = "admin";
        String inputPassword = "1234qwer!!";
//        login(inputId, inputPassword);
        // throws를 달고 나니깐 오류가 발생했음 -> try / catch / finally를 사용하라는 뜻
        // 혹은 main도 method에 해당하니깐 main 메서드에 throws를 입력해도 됨
        try {
            login(inputId, inputPassword);
        } catch (LoginFailedException e) {
            System.out.println("로그인 실패 : " + e.getMessage());
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
