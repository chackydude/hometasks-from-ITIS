import java.util.Date;

public class Programmer extends Human {
    protected String lang = "Java";
    protected int sloc = 0;

    public Programmer(String catchphrase, Date birthDate, String lang){
        this.catchphrase = catchphrase;
        this.birthDate = birthDate;
        this.lang = lang;
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("I will take one more cup of tea and try to go on to coding!");
    }

    public void code() {
        System.out.println("I'm coding on " + lang);
        sloc++;
    }
}
