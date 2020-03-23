import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private char gender;
    private int date;
    private int group;

    public Student() {};

    public Student(String name, int date) {
        this.name = name;
        this.date = date;
    }

    public Student(String name, char gender, int date, int group) {
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int data) {
        this.date = data;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "{" + this.name + ", " + this.gender + ", " + this.date + ", " + this.group + "}";
    }
}