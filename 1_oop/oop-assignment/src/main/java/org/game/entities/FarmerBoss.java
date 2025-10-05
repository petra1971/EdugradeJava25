package org.game.entities;

import org.game.utils.Helper;

public class FarmerBoss extends Enemy{

    public FarmerBoss(String name, int xpReward, int carrotReward) {
        super(name, xpReward, carrotReward);
    }

    //Concrete methods
    @Override
    public int attack() {
        //Randomise double damage
        int damage = 0;
        double damageRandomisor = Helper.random();
        if (damageRandomisor < 0.7) {
            damage = Helper.randomInt(30);
            System.out.println(this.getName() + " attacks with damage " + damage);
        } else if (damageRandomisor < 1) {
            damage = 2 * Helper.randomInt(30);
            System.out.println(this.getName() + " attacks with double damage " + damage);
        }
        return damage;
    }
}
