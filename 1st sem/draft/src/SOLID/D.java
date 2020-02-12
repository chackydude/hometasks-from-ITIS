package SOLID;
// Dependency inversion - привязанность классов должна быт ьне конкретной реализации, а к абстракции
// D - parent, D1 - inherit
abstract class D(food) {
}

//D1 - inherit
class D1(salad) extends D(food) {
}

class Human {
    private D food;

    public void startEating() {
        food = new D1;
    }

    public void sleep() {
        //
    }
}
