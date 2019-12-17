public class Dog {

    String name;
    boolean isCollarOn;
    boolean isLeashOn;
    boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        //
    }

    public void putCollar() {
        System.out.println("Ошейник надет!");
        this.isCollarOn = true;
    }

    public void outLeash() {
        System.out.println("Поводок надет!");
        this.isLeashOn = true;
    }

    public void putMuzzle() {
        System.out.println("Намордник надет!");
        this.isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyException {
        System.out.println("Собираемся на прогулку!");
        if (isCollarOn && isMuzzlePutOn && isLeashOn) {
            System.out.println("Собака в полной экипировке!");
        } else {
            throw new DogIsNotReadyException("Собака не готова!");
        }
    }
}
