import java.awt.*;

public abstract class Bird implements AbleToEat, AbleToSleep{
    protected int weight;
    protected String sounds;
    protected Color color;
    protected int coordinatesX, coordinatesY;

    public void fly(){
        System.out.println("I'm flying!");
    };
    public void sing(){
        System.out.println(sounds);
    };
}
