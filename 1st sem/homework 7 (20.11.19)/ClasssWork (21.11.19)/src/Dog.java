import java.util.Date;

public class Dog {
    public String breed;
    public String color;
    public String eyeColor;
    public String gender;
    public String name;
    public int height;
    public int hunger;
    public int training;
    public int weight;
    public Date birthDate;

    public void bark() {
        System.out.println("Haw! Rrrrr-rrr, I'm " + name + '!');
    }

    // first class
    public Dog(String name, String gender, String eyeColor) {
        this.eyeColor = eyeColor;
        this.gender = gender;
        this.name = name;
    }

    // second constructor
    public Dog(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    // third constructor
    public Dog(String name) {
        this.name = name;
    }

    // getters
    public Date getBirthDate() {
        return birthDate;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getHunger() {
        return hunger;
    }

    public int getTraining() {
        return training;
    }

    public int getWeight() {
        return weight;
    }

    //setterss
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setTraining(int training) {
        this.training = training;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
