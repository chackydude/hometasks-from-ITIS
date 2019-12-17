import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Dog dog = new Dog("Грей");
                dog.putCollar();
                dog.putMuzzle();

                try {
                        dog.walk();
                } catch (DogIsNotReadyException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Проверка сняряжения!" +
                                "\r\nОшейник: " + dog.isCollarOn +
                                "\nПоводок: " + dog.isMuzzlePutOn +
                                "\nНамордник: " + dog.isLeashOn);
                }
        }
}


