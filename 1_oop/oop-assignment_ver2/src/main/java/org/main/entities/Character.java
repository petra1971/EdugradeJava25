package org.main.entities;

public abstract class Character {
    protected String name;
    protected int hp;
    protected int maxHp;
    protected int damage;

    public Character(String name, int maxHp) {
        this.name = name;
        this.hp = maxHp; //is max at the beginning
        this.maxHp = maxHp;
    }

    //Abstract methods
    abstract int attack();    //Attack cause damage -> lower health for the attacked
    abstract void takeDamage(int damage);

    //Concrete methods
    public boolean isAlive() {
        return (hp > 0);
    }

    public String getName() {
        return name;
    }
}
