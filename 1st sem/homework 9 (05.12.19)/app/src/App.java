import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.init();
        app.start();
    }

    // Some app resources
    public Scanner  inputScanner;
    public String[] tasks;
    public int      tasksCount;
    public CommandAddTask addTask = new CommandAddTask();


    // Some app properties
    public final String[] COMMAND_NAMES = {
            "exit", "help", "add",
            "read", "readAll"
    };

    /**
     * Initialization function.
     */
    public void init(){
        inputScanner = new Scanner(System.in);
        tasks = new String[100];
        tasksCount = 0;
    }

    /**
     * Main running method.
     */
    public void start(){
        while(true){
            System.out.println("\nPlease input command.");
            String command = inputScanner.nextLine().trim();
            switch (command) {
                case "add":
                    addTask.execute();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                case "help":
                    runHelp();
                    break;
                case "read":
                    showOne();
                    break;
                case "readAll":
                    showAll();
                    break;
                default:
                    System.out.println("Unknown command");
                    runHelp();
                    break;
            }
        }
    }


    private void createTask() {
        String taskText = inputScanner.nextLine();
        tasks[tasksCount] = taskText;
        tasksCount++;
    }

    private void runHelp() {
        System.out.println("Commands that can be ran: " + Arrays.toString(COMMAND_NAMES));
    }

    private void showAll() {
        if(tasksCount > 0){
            for (int i = 0; i < tasksCount; i++) {
                System.out.println(tasks[i]);
            }
        }
        else{
            System.out.println("No tasks has been saved.");
        }
    }

    private void showOne() {
        int number = Integer.parseInt(inputScanner.nextLine().trim());
        int index = number-1;
        if(index < 0){
            System.out.println("Number must not be negative or zero.");
            showOne();
        }
        else if(index >= tasksCount){
            System.out.println("There is no task with that index.");
        }
        else{
            printTask(tasks[index]);
        }
    }

    public void printTask(String task){
        System.out.println("Task: " + task);
    }

    /*
    Getters / setters
     */

    public Scanner getInputScanner() {
        return inputScanner;
    }

    public String[] getTasks() {
        return tasks;
    }

    public int getTasksCount() {
        return tasksCount;
    }

    public String[] getCOMMAND_NAMES() {
        return COMMAND_NAMES;
    }

    public void setInputScanner(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }

    public void setTasks(String[] tasks) {
        this.tasks = tasks;
    }

    public void setTasksCount(int tasksCount) {
        this.tasksCount = tasksCount;
    }
}
