import java.util.Scanner;

public class CommandAddTask {
    public static void execute() {
        App app = new App();
        Scanner inputScanner = new Scanner(System.in);
        String taskText = inputScanner.nextLine();
        app.getTasks()[app.getTasksCount()] = taskText;
        app.setTasksCount(app.tasksCount++);
    }
}
