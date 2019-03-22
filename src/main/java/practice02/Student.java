package practice02;

public class Student extends Person{
    private int klass;
    public Student(String name, int age, int klass) {
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }
    public String introduce(){
        return "I am a Student. I am at Class " + klass + ".";
    }
}
