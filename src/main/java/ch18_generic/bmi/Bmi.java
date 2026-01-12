package ch18_generic.bmi;

public class Bmi {
    public double calcBmi(Person person) {
        return person.getWeight() / Math.pow((person.getHeight() / 100),2);
    }

    public void printResult(Person person) {
        String result;
        double bmi = calcBmi(person);
        if (bmi >= 35) {
            result = "3단계 비만";
        } else if (bmi >= 30) {
            result = "2단계 비만";
        } else if (bmi >= 25) {
            result = "1단계 비만";
        } else if (bmi >= 23) {
            result = "비만 전단계";
        } else if (bmi >= 18.5) {
            result = "정상";
        } else {
            result = "저체중";
        }
        System.out.printf(person.getName() + " 님의 키는 " + person.getHeight() + " cm, 몸무게는 " + person.getWeight() + " kg, " +
                "bmi 지수는 %.1f 으로 " + result + " 입니다.", bmi);
        System.out.println();
    }

}
