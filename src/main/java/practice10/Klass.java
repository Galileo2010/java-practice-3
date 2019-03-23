package practice10;

import java.util.ArrayList;

public class Klass {
    private int number;
    private Student leader;
    private ArrayList<Student> students = new ArrayList<>();


    public Klass(int number) {
        this.number = number;
        leader = null;
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
            leader = tom;
        else
            System.out.print("It is not one of us.\n");
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student jerry) {
        students.add(jerry);
    }
    public boolean isIn(Student jerry){ return jerry.getKlass() == this; }

}
