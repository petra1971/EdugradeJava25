package org.game.entities;

import org.game.utils.Helper;

public class Eagle extends Enemy {

    public Eagle(String name, int xpReward, int goldReward, int power) {
        super(name, xpReward, goldReward, power);
    }

    @Override
    public int attack() {
        int totalDamage = Helper.randomInt() * 20;
        System.out.println(this.getName() + " attacks with a total power of " + totalDamage);
        return totalDamage;
    }

    @Override
    public void status() {
        System.out.println("Name is " + name + " and health is " + health + "/" + maxHealth);
    }
}
