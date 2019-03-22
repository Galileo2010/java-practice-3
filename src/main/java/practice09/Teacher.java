package practice09;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        klass = null;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Teacher. I teach "+ (klass == null ? "No Class." : klass.getDisplayName() + ".");
    }

    public String introduceWith(Student jerry) {
        return super.introduce() + " I am a Teacher. I "+ (klass.getNumber() == jerry.getKlass().getNumber() ? "" : "don't ")+ "teach " + jerry.getName() + ".";

    }

    public Klass getKlass() {
        return klass;
    }
}
