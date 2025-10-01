package org.game;

public abstract class Character {
    protected String name;
    protected final int maxHealth = 100 ;
    protected int health;

    public Character(String name) {
        this.name = name;
    }
    //Attack cause damage. Most damage wins.
    abstract int attack(int power);

    boolean isAlive(int health) {
        return (health > 0);
    }
    void takeDamage(int damage) {
        health -= damage;
    }
    void status() {
        //TODO
        System.out.println();
    }

}