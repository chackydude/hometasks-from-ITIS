import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] COMMANDS = new String[] {"add", "get element", "get size", "get capacity",
                       "remove element", "equal arrays", "get hash code", "turn to string", "turn to string +",
                        "index of", "index of-from", "show array", "exit"};
        EndlessArray array = new EndlessArray();
        String command = new String();
        System.out.println("Commands can be: " + Arrays.toString(COMMANDS));
        while (!command.equals("exit")) {
            Scanner inputScanner = new Scanner(System.in);
            command = inputScanner.nextLine();
            switch (command) {
                case "add":
                    System.out.println("Enter the element:");
                    array.addElement(inputScanner.nextInt());
                    System.out.println("Added.");
                    break;
                case "get element" :
                    System.out.println("Enter index of the element");
                    try {
                        System.out.println("Result: " + array.getElement(inputScanner.nextInt()));
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "get size":
                    System.out.println("Result: " + array.getSize());
                    break;
                case "get capacity":
                    System.out.println("Result: " + array.getCapacity());
                    break;
                case "remove element":
                    System.out.println("Enter index of the removing element:");
                    try {
                        array.removeElement(inputScanner.nextInt());
                        System.out.println("Removed.");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "equal arrays":
                    System.out.println("Enter array's length:");
                    int len = inputScanner.nextInt();
                    int[] inputArray = new int[len];
                    System.out.println("Enter elements of the array:");
                    for (int i = 0; i < len; i++) {
                        inputArray[i] = inputScanner.nextInt();
                    };
                    System.out.println("Result: " + array.checkEquals(inputArray));
                    break;
                case "get hash code":
                    System.out.println("Hash code: " + array.hashCode());
                    break;
                case "turn to string":
                    System.out.println(array.turnToString());
                    break;
                case "turn to string +":
                    System.out.println("Enter characters what can be between array's elements: ");
                    String gap = inputScanner.nextLine();
                    System.out.println(array.turnToString(gap));
                    break;
                case "index of":
                    System.out.println("Enter element: ");
                    int element = inputScanner.nextInt();
                    System.out.println("Result: " + array.showIndexOf(element));
                    break;
                case "index of-from":
                    System.out.println("Enter element: ");
                    int element1 = inputScanner.nextInt();
                    System.out.println("Enter starting position: ");
                    int pos = inputScanner.nextInt();
                    try {
                        System.out.println("Result: " + array.showIndexOf(element1, pos));
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "show array":
                    array.showArray();
                    System.out.println();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Unknown command.");
                    System.out.println("Commands can be: " + Arrays.toString(COMMANDS));
                    break;
            };
        };
    }
}