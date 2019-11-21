// package ru.kpfu.ITIS.trofimoff.dog - how to send to the package
import java.util.Date;
import java.util.Objects;

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

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", hunger=" + hunger +
                ", training=" + training +
                ", weight=" + weight +
                ", birthDate=" + birthDate +
                '}';
    }

    // how it works!?
    @Override
    public boolean equals(Object o) {
        // check
        if (this == o) return true;
        // check availiblity of the link(!= null) and check type of Object
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return height == dog.height &&
                hunger == dog.hunger &&
                training == dog.training &&
                weight == dog.weight &&
                Objects.equals(breed, dog.breed) &&
                Objects.equals(color, dog.color) &&
                Objects.equals(eyeColor, dog.eyeColor) &&
                Objects.equals(gender, dog.gender) &&
                Objects.equals(name, dog.name) &&
                Objects.equals(birthDate, dog.birthDate);
    }

    @Override
    // return's ID of Object
    public int hashCode() {
        return Objects.hash(breed, color, eyeColor, gender, name, height, hunger, training, weight, birthDate);
    }

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

    //setters
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
