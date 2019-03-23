package practice11;

import java.util.ArrayList;

public class Klass {
    private int number;
    private Student leader;
    private Teacher teacher;
    private ArrayList<Student> students = new ArrayList<>();


    public Klass(int number) {
        this.number = number;
        leader = null;
        teacher = null;
        students.clear();
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student tom) {
        if (students.contains(tom))
        {
            leader = tom;
            if (teacher != null)System.out.print("I am "+teacher.getName()+". I know "+tom.getName()+" become Leader of "+getDisplayName()+".\n");
        }
        else
            System.out.print("It is not one of us.\n");
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getLeader() {
        return leader;
    }
    public void appendMember(Student jerry) {
        students.add(jerry);
        if (teacher != null)System.out.print("I am "+teacher.getName()+". I know "+jerry.getName()+" has joined "+getDisplayName()+".\n");
    }
    public boolean isIn(Student jerry){ return  jerry.getKlass() == this; }
}
