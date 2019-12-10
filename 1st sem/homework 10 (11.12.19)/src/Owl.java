import java.awt.*;
public class Owl extends Bird{
    protected String headState = "normal";

    public Owl(int weight, String sounds) {
        this.weight = weight;
        this.sounds = sounds;
    }

    @Override
    public void eat() {
        System.out.println("Eating my dinner!");
    }

    @Override
    public void sleep() {
        System.out.println("Pls be quite, I'm sleeping!");
    }

    public void fly() {
        System.out.println("I'm flying! But only at night!");
    }

    public void sing() {
        System.out.println(sounds + " that's me, Owl!");
    }

    public void scare() {
        headState = "not normal";
    }
}
