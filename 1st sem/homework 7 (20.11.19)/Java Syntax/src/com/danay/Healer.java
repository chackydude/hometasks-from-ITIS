package com.danay;

import com.danay.ITIS.Fighter;

public class Healer extends Fighter {

    public Healer(String name, String battleCry) {
        super(name, battleCry);
    }

    public void heal(Fighter target) {
        if (target.status == "hurt") {
            target.hp += (int) Math.ceil(Math.random() * 4);
            System.out.println("Healer: " + battleCry + " " + target.name + "'s hp: " + target.hp);
        } else System.out.println("Healer: You're too healthy, sorry...");
    }

}
