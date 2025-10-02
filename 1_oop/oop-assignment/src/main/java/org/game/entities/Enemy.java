package org.game.entities;

public abstract class Enemy extends org.game.entities.Character {
    protected int power;
    protected int xpReward;
    protected int goldReward;

    public Enemy(String name, int xpReward, int goldReward, int power) {
        super(name);
        this.xpReward = xpReward;
        this.goldReward = goldReward;
        this.power = power;
    }

    //Abstract method
    abstract void status();

    //Concrete methods
    public int getXpReward() {
        return xpReward;
    }
    public int getGoldReward() {
        return goldReward;
    }


}
