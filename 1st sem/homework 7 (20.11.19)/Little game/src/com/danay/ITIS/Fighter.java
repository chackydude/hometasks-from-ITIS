package com.danay.ITIS;

import java.sql.SQLOutput;

public class Fighter {
    public int hp = 20;
    public String name;
    public String battleCry;
    public String status = "healthy";

    public Fighter(String name) {
        this(name, "Aaaaaaa!");
    }
    public Fighter(String name, String battleCry) {
        this.name = name;
        this.battleCry = battleCry;
    }
    public void shoutBattleCry() {
        System.out.println(name + " : " + battleCry);
    }
    public static void kick(Fighter target, int power) {
        if (Math.random() > (float) power/10) {
            target.hp -= power;
            System.out.println("Fighter kicks target! " + target.name + "'s hp: " + target.hp);
        } else System.out.println("Missed! " + target.name + "'s hp: " + target.hp);
    }
    public void callHealer() {
        if (hp < 10) {
            System.out.println("I need heal!");
        }
    }

    public String checkStatus() {
        if (hp >= 5) {
            status = "healthy";
        } else status = "hurt";
        return status;
    }

}
