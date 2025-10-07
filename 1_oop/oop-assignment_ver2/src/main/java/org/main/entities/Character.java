package org.main.entities;

public abstract class Character {
    protected String name;
    protected int hp;
    protected int MAXHP;
    protected int damage;

    public Character(String name, int hp, int MAXHP, int damage) {
        this.name = name;
        this.hp = hp;
        this.MAXHP = MAXHP;
        this.damage = damage;
    }

    //Abstract methods
    abstract int attack();    //Attack cause damage -> lower health for the attacked
    abstract int takeDamage();
    //    abstract void takeDamage(int damage);

    //Concrete methods
    public boolean isAlive() {
        return (hp > 0);
    }
}
