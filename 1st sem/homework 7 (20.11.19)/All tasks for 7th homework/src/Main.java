import java.net.FileNameMap;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Commands that can be ran: " + Arrays.toString(COMMAND_NAMES));
        Main app = new Main();
        app.init();
        app.start();
    }

    //initialization
    public Fibonachi fib = new Fibonachi();
    public Reverse reverse = new Reverse();
    public Copy copy = new Copy();
    public Pascal pascal = new Pascal();
    public Scanner input = new Scanner(System.in);
    public String inputScanner = input.nextLine();
    public static String[] COMMAND_NAMES = {"Fibonachi", "Copy", "Reverse", "Pascal", "Exit"};


    //initialization method
    public void init() {
    }

    //main running method
    public void start() {
        switch (inputScanner) {
            case "Fibonachi":
                fib.startFib();
                break;
            case "Reverse":
                reverse.startReverse();
                break;
            case "Pascal":
                pascal.startPascal();
                break;
            case "Copy":
                copy.startCopy();
                break;
            case "Exit":
                System.exit(0);
            default:
                System.out.println("Unknown command");
                break;
        }
    }
}