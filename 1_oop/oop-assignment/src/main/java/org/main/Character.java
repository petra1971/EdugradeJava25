package org.main;

public abstract class Character {
    protected String name;
    protected int maxHealth;
    protected int health;

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
    }

    abstract boolean isAlive(int health);
    abstract void takeDamage(int damage);
    abstract void attack(int power);

    void status() {
        //TODO
        System.out.println();
    }


}