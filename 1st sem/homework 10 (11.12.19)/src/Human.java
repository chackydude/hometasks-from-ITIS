import java.awt.*;
import java.util.Date;

public abstract class Human implements Eater, Sleeper {
    protected String name;
    protected String catchphrase;
    protected Date birthDate;
    protected Color eyeColor;
    protected Color hairColor;
    protected int coordinatesX, coordinatesY;

    public void talk() {
        System.out.println(catchphrase);
    }
    public void run(){
        System.out.println("I'm running!");
    }
    public void jump(){
        System.out.println("I'm jumping!");
    }
}
