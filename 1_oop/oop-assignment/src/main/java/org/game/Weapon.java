package org.game;

public class Weapon {

    private String name;
    private int power;

    public Weapon(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void printInfo() {
        System.out.println("Strength name: " + name + "and Injury: " + power);
    }
}