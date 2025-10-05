package org.game.entities;

import org.game.utils.Helper;

public abstract class Enemy extends Character {
    protected int xpReward;
    protected int carrotReward;

    public Enemy(String name, int xpReward, int carrotReward) {
        super(name,100);
        this.xpReward = xpReward;
        this.carrotReward = carrotReward;
    }
    //Abstract methods
    public abstract int attack();

//    //Concrete methods
//    @Override
//    public void takeDamage(int damage) {
//        health -= damage;
//        if (health < 0)
//            health = 0;
//        status();
//    }

    @Override
    public void status() {
        System.out.println(name + " status: HP = " + health + "/" + maxHealth);
//        System.out.println();
    }

    //Getters
    public int getXpReward() {
        return xpReward;
    }

    public int getCarrotReward() {
        return carrotReward;
    }
}
