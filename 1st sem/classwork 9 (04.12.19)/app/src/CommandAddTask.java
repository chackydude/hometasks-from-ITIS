import java.util.Scanner;

public class CommandAddTask {

    App app;

    public CommandAddTask(App app) {
        this.app = app;
    }

    public void execute() {
        app.getTask();
    }
}
