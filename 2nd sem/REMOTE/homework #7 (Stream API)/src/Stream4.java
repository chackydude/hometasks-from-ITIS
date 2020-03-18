import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Stream1 {

    private static class Student {
        private int height;
        // height takes precedence
        private int iq;
        private String name;

        public Student(String name, int height, int iq) {
            this.name = name;
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

        public int compareTo(Object o) {
            return 0;
        }

        @Override
        public String toString() {
            return "{" + this.name + ", " + this.height + ", " + this.iq + "}";
        }
    }

    private static class HeightComparator implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            if (s1.getHeight() > s2.getHeight()) {
                return 1;
            } else if (s1.getHeight() < s2.getHeight()) {
                return -1;
            } return 0;
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList();

        students.add(new Student("Mike",175, 100));
        students.add(new Student("John",171, 120));
        students.add(new Student("Steven", 172, 120));
        students.add(new Student("Matt",174, 120));
        students.add(new Student("Lenny", 170, 110));

        // λ
        HeightComparator comparator = new HeightComparator();
        students.sort((s1, s2) -> comparator.compare(s1, s2));
        students.forEach((student) -> System.out.print(student.toString() + ", "));
    }
}
