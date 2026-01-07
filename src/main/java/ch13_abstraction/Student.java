package ch13_abstraction;

public class Student extends Person {
    private String school;

    public Student(String name) {
        super(name);
    }

    public Student(String name, String school) {
        super(name);
        this.school = school;
    }

    @Override
    public void introduce() {

    }
}
