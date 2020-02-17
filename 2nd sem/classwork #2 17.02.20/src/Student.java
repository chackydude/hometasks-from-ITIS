public class Student {
    private int height;
    // height takes precedence
    private int iq;

    public Student(int height, int iq) {
        this.height = height;
        this.iq = iq;
    }

    public int getHeight() {
        return height;
    }

    public int getIq() {
        return iq;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
