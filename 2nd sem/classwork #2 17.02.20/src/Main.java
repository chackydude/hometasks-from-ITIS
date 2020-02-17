public class Main {
    public static void main(String[] args) {
        // array of students
        Student[] students = new Student[10];
        // new instances of comparators
        HeightStudentComparator byHeight = new HeightStudentComparator();
        IqStudentComparator byIq = new IqStudentComparator();
        // generating random students
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student((int)(150 + Math.random()*50), (int) (100 + Math.random()*50));
        }
        // bubble sort
        boolean isSorted = false;
        Student buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < students.length-1; i++) {
                  // sorting students by height
                  if (byHeight.compare(students[i],students[i+1]) > 0) {
                    isSorted = false;

                    buf = students[i];
                    students[i] = students[i+1];
                    students[i+1] = buf;
                // if two students have same heights, we compare them by IQ
                } else if (byHeight.compare(students[i],students[i+1]) == 0) {
                      if (byIq.compare(students[i],students[i+1]) > 0) {
                          isSorted = false;

                          buf = students[i];
                          students[i] = students[i+1];
                          students[i+1] = buf;
                      }
                  }
            }
        }
        // logs
        for (Student student: students) {
            System.out.print(student.getHeight() + " ");
            System.out.print(student.getIq() + " ");
            System.out.println();
        }
    }
}
