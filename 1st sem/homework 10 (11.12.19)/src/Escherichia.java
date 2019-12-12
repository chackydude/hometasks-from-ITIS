import java.awt.*;

public class Escherichia extends Bactrerium {
    protected Color color = Color.red;
    protected String type = "Acidobacteria";
    protected int amountOfDescendants = 0;

    @Override
    public void eat() {};

    public void divide() {
        amountOfDescendants++;
    }

    public void shoutBattleCry() {
        System.out.println("That's me, " + color + " " + type + "! I will eat you!");
    }
}