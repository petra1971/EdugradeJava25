package org.game;

public class Weapon {

    private String name;
    private int damage;

    public Weapon(String name, int power) {
        this.name = name;
        this.damage = power;
    }

    public int getDamage() {
        return damage;
    }

    public void printInfo() {
        System.out.println("Weapon " + name + " cause " + damage + " damage");
    }
}