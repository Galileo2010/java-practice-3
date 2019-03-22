package practice01;

public class Person {
    public String name;
    public int age;

    public Person(String tom, int i) {
        name = tom;
        age = i;
    }

    public String introduce(){
        return "My name is "+name+"."+" I am "+age+" years old.";
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
