import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.init();
        app.start();
    }

    public final String[] COMMANDS = {
            "exit", "showStudentAll", "addStudent",
            "sortStudents", "getRandom", "help"
    };

    public Scanner  inputScanner;
    public String[] studentName;
    public String[] studentSoname;
    public String[] studentDate;
    public int[] studentScore;
    public int[] len;

    public void init(){
        inputScanner = new Scanner(System.in);
        studentName = new String[100] {"Sasha", "Vasya", "Misha"};
        studentSoname = new String[100] {"Petrov", "Komarov", "Ivanov"};
        studentDate = new String[100] {"10/10/2001", "09/10/1999", "08/09/1988"};
        studentScore = new int[100] {5, 4, 3};
        len = new int[100] {calculateLen(studentName[0], studentSoname[0]), calculateLen(studentName[1], studentSoname[1]),
                calculateLen(studentName[2], studentSoname[2])};
    }

    public void start(){
        while(true){
            System.out.println("Please input command:");
            String command = inputScanner.nextLine().trim();
            switch (command) {
                case "showStudentAll":
                    showStudentAll();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                case "help":
                    runHelp();
                    break;
                case "addStudent":
                    addStudent();
                    break;
                case "sortStudents":
                    sortStudents();
                    break;
                case "getRandom":
                    getRandom();
                    break;
                default:
                    System.out.println("Unknown command");
                    runHelp();
                    break;
            }
        }
    }

    public int calculateLen(String name, String soname) {
        return name.length() + soname.length();
    }

    public int maxLength() {
        int max = 0;
        for (int i = 0; i < len.length; i++) {
            if (len[i] > max) {
                max = len[i];
            }
        }
        return max;
    }

    public void runHelp() {
        System.out.println("Commands that can be ran: " + Arrays.toString(COMMANDS));
    }

    public void showStudentAll() {
        for (int i = 0; i < studentName.length; i++) {
            showStudent(i);
        }
    }

    public void showStudent(int i) {
                System.out.println(studentName[i]);
                for (int j = 0; j < maxLength(); j++) {
                    System.out.print(" ");
                }
                System.out.print(studentSoname[i] + " " + studentDate[i] + " " + studentScore[i]);
        }
    }

    public void addStudent() {
        System.out.println("Please enter name, soname, date (num/month/year), score");
        int len = studentName.length;
        studentName[len] = inputScanner.nextLine();
        studentSoname[len] = inputScanner.nextLine();
        studentDate[len] = inputScanner.nextLine();
        studentScore[len] = inputScanner.nextInt();
    }

    public void sortStudents() {
        System.out.println("Choose the type of sorting: 'Up' or 'Down':");
        String input = inputScanner.nextLine();
        switch (input) {
            case "Up":
                upSort();
                break;
            case "Down":
                downSort();
                break;
            default:
                System.out.println("Unkown command");
                break;
        }
    }

    public void upSort() {
        //метод который присваивает массиву отсортированный studentScore
        //и от меньшего studentScore[i] до большего studentScore[i];
    }

    public void downSort() {
        //метод который присваивает массиву отсортированный studentScore
        //и от большего studentScore[i] к меньшему studentScore[i];
    }

    public void getRandom() {
        int num = (int) Math.ceil(studentName.length * Math.random());
        showStudent(num);
    }
}
