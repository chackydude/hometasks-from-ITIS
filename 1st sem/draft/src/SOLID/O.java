package SOLID;

// Open/closed - открыт для расширения, закрыт для модификаций
// bad example
public class O {
    // god-method
    public int bulbulator() {
        // calculates perimeter
        // balbulates area
        // balbulates Leha
    }
}

// good
public class O2 {
    private int height;
    private int weight;

    public int  calulatePerimeter() {
        //
    }

    public int balbulateRea() {
        //
    }

    public int balbulateLeha() {
        //
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}

// one more example (good example)
// so, we have class Order
public class Order {
    some methods;
}

public class OrderHuerder extends Order {
    // add some new methods, don't change anything in the old class, just add new
    // methods
}