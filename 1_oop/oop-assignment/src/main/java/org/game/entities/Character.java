package org.game.entities;

    public abstract class Character {

    protected String name;
    protected final int maxHealth = 100 ;
    protected int health;

    public Character(String name) {
        this.name = name;
    }

    //Abstract methods
    abstract int attack();    //Attack cause damage -> lower health for the attacked

    //Concrete methods
    public boolean isAlive(int health) {
        return (health > 0);
    }
    public void takeDamage(int damage) {
        health -= damage;
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
}