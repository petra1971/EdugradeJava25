package org.game.gameEngine;

import org.game.entities.*;
import org.game.utils.Helper;

public class Adventure {
    private SafePlace safePlace;
    private Fight fight;

    public void startAdventure(Hero hero) {
        //Go on adventure
        double randomiseAdventure = Helper.random();
        if (randomiseAdventure < 0.70) {
            //Fight with Dog
            fight = new Fight(hero, new Dog("Big and furious dog", 10, 5));
        } else if (randomiseAdventure < 0.80) {
            //Fight with FarmerBoss
            fight = new Fight(hero, new FarmerBoss("Insane farmer", 20, 10));
        } else {
            //SafePlace
            safePlace = new SafePlace("deep whole with ", 4, 5);
            safePlace.visitSafePlace(hero);
        }
    }
}
