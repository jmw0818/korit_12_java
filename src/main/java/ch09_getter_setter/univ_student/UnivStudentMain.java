package ch09_getter_setter.univ_student;

public class UnivStudentMain {
    public static void main(String[] args) {
        UnivStudent student1 = new UnivStudent();
        student1.setName("김일");
        student1.setGrade(1);
        student1.setScore(3.3);
        student1.showInfo();

        UnivStudent student2 = new UnivStudent();
        student2.setName("김이");
        student2.setGrade(3);
        student2.setScore(-30);
        student2.setScore(4.0);

        UnivStudent student3 = new UnivStudent();
        student3.setName("김삼");
        student3.setGrade(5);
        student3.setGrade(2);
        student3.setScore(2.7);

        UnivStudent student4 = new UnivStudent();
        student4.setName("김사");
        student4.setGrade(4);
        student4.setScore(3.8);

        UnivStudent student5 = new UnivStudent();
        student5.setName("김오");
        student5.setGrade(2);
        student5.setScore(1.0);


        student2.showInfo();
        student3.showInfo();
        student4.showInfo();
        student5.showInfo();
    }
}
