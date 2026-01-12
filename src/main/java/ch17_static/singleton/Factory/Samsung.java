package ch17_static.singleton.Factory;

import lombok.Getter;

public class Samsung {
    private static Samsung instance;

    @Getter
    private String company;
    private int serialNumber;

    private Samsung() {
        company = getClass().getSimpleName();   // company = "Samsung"
        serialNumber = 20260000;                // 정적 변수로 20260000로 만들어도 상관없음.
                                                // 객체가 하나만 만들어지기 때문에 보여주기 위해
        System.out.println("삼성 객체가 생성되었습니다.");
    }

    // 정적 메서드
    public static Samsung getInstance() {
        if (instance == null) {
            instance = new Samsung();
        }
        return instance;
    }

    // 일반 메서드
    public String createSerialNumber(String model) {
        return model + "_" + ++serialNumber;
    }
    // 싱글톤으로 인해서 객체가 하나만 생성될거라는 것을 알고 있는 상태
    // 이 메서드가 호출됐을 떄, ++가 적용은 될것인데 다수의 객체를 만들려고 시도해봤자
    // 하나만 만들어지기 때문에
}
