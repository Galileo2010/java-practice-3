package practice10;

import java.util.Collection;
import java.util.LinkedList;

public class Teacher extends Person{
    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        classes = null;
    }

    @Override
    public String introduce() {
        String info = " I teach Class";
        if (classes != null && classes.size()!= 0 )
        {
            for (Klass klass : classes)
                info += " " + klass.getNumber() + ",";
                info = info.substring(0,info.length()-1) + ".";
        }
        else
            info = " I teach No Class.";
        return super.introduce() + " I am a Teacher."+ info;
    }

    public String introduceWith(Student jerry) {
        return super.introduce() + " I am a Teacher. I "+ (isTeaching(jerry) ? "" : "don't ")+ "teach " + jerry.getName() + ".";
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public boolean isTeaching(Student jerry) {
        return  classes.contains(jerry.getKlass());
    }
}
