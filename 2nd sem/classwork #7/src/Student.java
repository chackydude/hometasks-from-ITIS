public class Student {
    private String name;
    private int date;

    public Student(){};

    public Student(String name) {
        this.name = name;
    }

    public Student(int date) {
        this.date = date;
    }

    public Student(String name, int date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int data) {
        this.date = data;
    }

    @Override
    public String toString() {
        return "{" + this.name + ", "  + this.date + "}";
    }
}