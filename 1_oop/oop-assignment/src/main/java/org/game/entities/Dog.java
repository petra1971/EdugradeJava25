package org.game.entities;

import org.game.utils.Helper;

public class Dog extends Enemy {

    public Dog(String name, int xpReward, int carrotReward) {
        super(name, xpReward, carrotReward);
    }

    //Concrete methods
    @Override
    public int attack() {
        int damage = Helper.randomInt(20);
        System.out.println(this.getName() + " attacks with damage " + damage);
        return damage;
    }
//    @Override
//    public void status() {
//        System.out.println(name + " HP: " + health + "/" + maxHealth);
//    }
}
