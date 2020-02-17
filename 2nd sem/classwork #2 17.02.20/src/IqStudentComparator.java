// compare by IQ
public class IqStudentComparator implements Comparator <Student> {
    public int compare(Student s1, Student s2) {
        if (s1.getIq() > s2.getIq()) {
            return 1;
        } else if (s1.getIq() < s2.getIq()) {
            return -1;
        } else return 0;
    }
}
