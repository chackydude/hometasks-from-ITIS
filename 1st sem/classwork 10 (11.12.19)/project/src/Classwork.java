public class Classwork {
    public static void main(String[] args) {
        int mass[] = {1,2,3};
        try {
            mass[4] = 5;
        }
        catch(IndexOutOfBoundsException E) {
            System.out.println("12142");
        }
        try {
            Object o = new Object();
            o = null;
            o.toString();
        } catch (NullPointerException e) {
            System.out.println("wtf");
        }
    }
}
