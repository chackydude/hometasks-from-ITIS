package Tasks2;
// main for tesk Otrezok
public class Main {
    public static void main(String[] args) {
        Otrezok ot1 = new Otrezok(0,0,1,0);
        Otrezok[] array = new Otrezok[3];
        for (int i = 0; i < 3; i++) {
            array[i] = ot1;
        }
        System.out.println(calcMultLength(array));
    }

    public static int calcMultLength(Otrezok[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i].calcLength();
        }
        return result;
    }
}
