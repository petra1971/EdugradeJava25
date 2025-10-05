package org.game.entities;

    public abstract class Character {
    protected String name;
    protected int maxHealth;
    protected int health;
    protected int damage;

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    //Abstract methods
    abstract int attack();    //Attack cause damage -> lower health for the attacked
//    abstract void takeDamage(int damage);
    abstract void status();

    //Concrete methods
    public boolean isAlive() {
        return (health > 0);
    }

    public void takeDamage(int damage) {
        health = health - damage;
        if (health < 0)
            health = 0;
        status();
    }

    //Getters and setters
    public String getName() {
        return name;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public int getHealth() {
        return health;
    }
    public int getDamage() {
        return damage;
    }
}