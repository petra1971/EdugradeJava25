package org.game;

public abstract class Monster extends Character {
    protected int power;
    protected int xpReward;
    protected int goldReward;

    public Monster(String name, int xpReward, int goldReward, int power) {
        super(name);
        this.xpReward = xpReward;
        this.goldReward = goldReward;
        this.power = power;
    }

    @Override
    void status() {
        System.out.println("Name is " + name + " and health is " + health + "/" + maxHealth);
    }
}
