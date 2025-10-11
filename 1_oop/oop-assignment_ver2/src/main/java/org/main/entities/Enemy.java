package org.main.entities;

public abstract class Enemy extends Character{

    protected int xpReward;
    protected int carrotReward;

    public Enemy(String name, int maxHp, int damage) {
        super(name, maxHp, damage);
    }

    abstract int attack();

    @Override
    void takeDamage(int damage) {
        hp -= damage;
        if (!isAlive()) {
            System.out.println(name + " took damage and died!");
        }
    }
}
