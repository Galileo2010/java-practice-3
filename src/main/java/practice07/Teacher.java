package practice07;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
        klass = null;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Teacher. I teach "+ (klass == null ? "No Class." : klass.getDisplayName() + ".");
    }

    public String introduceWith(Student jerry) {
        return super.introduce() + " I am a Teacher. I "+ (klass.getNumber() == jerry.getKlass().getNumber() ? "" : "don't ")+ "teach " + jerry.getName() + ".";
    }
}
