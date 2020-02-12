package SOLID;
// Liskov substitution - подставляя экземпляры наследников, вместо экземпляров родителей, программа должна отаваться такой же
// работоспособной
// L - plane L1 - Strij
public class L {
    private int speed;
    private int size;

    public int calcRasstoyaniee(int time) {
        return time*this.speed;
        // speed змеряется в км в час
    }
}


public class L1 extends L {
    public calcRastoyaniee(int time) {
        return time*this.speed;
        // где speed измеряется в м в час
    }
}