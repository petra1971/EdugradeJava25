package org.game.entities;

import org.game.utils.Helper;

public class SafePlace {
    private String name;
    private int carrotReward;
    private int xpReward;

    public SafePlace() {

    }
    public SafePlace(String name, int carrotReward, int xpReward) {
        this.name = name;
        this.carrotReward = carrotReward;
        this.xpReward = xpReward;
    }

    public void visitSafePlace(Hero hero) {
        if (hero.isAlive()) {
            //Hero is alive
            //TODO: fix random xpReward and carrotReward
            xpReward = Helper.randomInt(10);
            carrotReward = Helper.randomInt(5);

            hero.gainXp(xpReward);
            hero.gainCarrots(carrotReward);
//            hero.levelUp(healthReward());
            System.out.println("You were lucky that found a " + name + " with " + carrotReward + " carrots.");
            System.out.println("Well deserved! Your XP level increase with " + xpReward + ".");
            hero.status();
        }
    }
}

