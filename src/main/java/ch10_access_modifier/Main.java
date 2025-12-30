package ch10_access_modifier;

class AccessModifierExample {  // 간판 클래스는 public이 명시돼야 함.
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;
    private int privateVar = 40;

    public int getPrivateVar() {
        return privateVar;
    }

}

public class Main {
    public static void main(String[] args) {
        AccessModifierExample example = new AccessModifierExample();
        System.out.println(example.publicVar);
        System.out.println(example.protectedVar);
        System.out.println(example.defaultVar);
//        System.out.println(example.privateVar);
        System.out.println(example.getPrivateVar());    // public getPrivateVar로 접근 가능
    }
}
