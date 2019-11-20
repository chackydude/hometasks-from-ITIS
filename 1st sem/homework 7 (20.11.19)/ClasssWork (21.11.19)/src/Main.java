import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Dog dog = new Dog(name);
        System.out.println(dog.getName());
        dog.bark();
    }
}
