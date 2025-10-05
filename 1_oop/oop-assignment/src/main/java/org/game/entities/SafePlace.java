package org.game.entities;

import org.game.utils.Helper;

public class SafePlace {
    private String name;
    private int carrotReward;
    private int xpReward;
    private Hero hero;

    public SafePlace(String name, int xpReward, int carrotReward) {
        this.name = name;
        this.xpReward = xpReward;
        this.carrotReward = carrotReward;
    }

    public void visitSafePlace(Hero hero) {

        //TODO: fix random xpReward and carrotReward
//            xpReward = Helper.randomInt(10);
//            carrotReward = Helper.randomInt(5);

        hero.gainXp(xpReward);
        hero.gainCarrots(carrotReward);
        System.out.println("You were lucky that found a " + name + " with " + carrotReward + " carrots,");
        System.out.println("You read a very clever book while eating all carrots and got " + xpReward + " XP in reward.");
        hero.status();
    }
}

