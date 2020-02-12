package SOLID;
// single resposibility
// god object - есть, что существование объекта, который решает все поставленные задачи недопустимо,
// т.е. нужно создавать объекты, которые решают не все, а определенные, конкретные задачи
public class S {
    public void call() {
        System.out.println("calling...");
    }
    public void draw() {
        System.out.println("drawing...");
    }
    public void run() {
        System.out.println("running...");
    }
}
