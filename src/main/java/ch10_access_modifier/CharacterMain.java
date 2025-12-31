package ch10_access_modifier;
/*
    목표 : 객체 지향 설계 및 접근 제어자 이해를 바탕으로
    다양한 접근 수준의 필드와 메서드를 갖는 캐릭터 클래스를 정의

    1. field
        name - 캐릭터 이름 / 공개 가능
        health - 체력 / 읽기만 허용
        power - 공격력 / 같은 패키지만
        skill - 스킬명 / 자식 클래스만
        exp - 경험치 / 외부에서 완전 차단

       Character 클래스의 인스턴스인 warrior를 생성
       이름 : 전사
       체력 : 100
       공격력 : 200
       스킬 : 세로 베기
       exp 30
       으로 기본 생성자를 통해 생성하고, setter를 통하여 데이터를 설정하시오.
    2. method
        getHealth()
        attack() : 공격 시 콘솔 창에
            name 이(가) power로 공격 !
            name 이(가) 경험치 amount을(를) 얻었습니다.
        heal() : 체력을 10 회복하고, 현재 체력 출력
            체력이 10 회복되었습니다. 현재 체력 : health(숫자로 출력)
        getExp(int amount) -> call2() 유형인데 경험치를 증가시키는 메서드(내부 전용)
            name이(가) 경험치 amount을(를) 얻었습니다.
 */
class Character {
    public String name;             // 공개 가능
    private int health;             // 읽기 전용
    int power;                      // 같은 패키지만
    protected String skill;         // 상속을 받는 자식 클래스까지
    private int exp;                // 완전 차단

    public Character() {
    }

    public Character(String name, int power, String skill) {
        this.name = name;
        this.power = power;
        this.skill = skill;

        this.health = 100;
        this.exp = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getExp() {
        return exp;
    }

    private void setExp(int exp) {
        this.exp = exp;
    }
    private void gainExp(int amount) {
        exp += amount;
        System.out.println(name + "이(가) 경험치를 " + amount + " 얻었습니다.");
    }
    public void attack() {
        System.out.println(name + "이(가) " + power + "의 힘으로 공격합니다.");
        this.gainExp(10);
        int currentExp = this.getExp();
        this.setExp(currentExp + 10);
        System.out.println(name + "이(가) 경험치를 " + 10 + " 얻었습니다.");

    }
    public void heal() {
        health += 10;
        System.out.println(name + "의 체력이 10 회복되었습니다. 현재 체력 : " + health);
    }
}

public class CharacterMain {
    public static void main(String[] args) {
        Character warrior = new Character();
        warrior.setName("전사");
        warrior.setHealth(100);
        warrior.setPower(200);
        warrior.setSkill("세로 베기");
//        warrior.setExp(30);
        warrior.attack();
        warrior.heal();

        Character healer = new Character("힐러", 100, "힐");
        System.out.println(healer.getHealth());
        System.out.println(healer.getExp());

    }
}
