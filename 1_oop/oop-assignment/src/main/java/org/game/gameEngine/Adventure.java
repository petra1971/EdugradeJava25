package org.game.gameEngine;

import org.game.entities.*;
import org.game.utils.Helper;

public class Adventure {
    //What is needed for different adventures
    private Hero hero;
    private FarmerBoss farmerBoss;
    private Dog dog;
    private SafePlace safePlace;
    private Fight fight;

    public Adventure(Hero hero) {
        this.hero = hero;
        this.safePlace = new SafePlace("deep whole ", 20, 20);
    }

    public boolean startAdventure() {

        boolean heroIsAlive = true;

        //Randomise adventure
        double randomiseAdventure = Helper.random();
//        System.out.println("Random value " + randomiseAdventure);

        //Fight with Dog
        if (randomiseAdventure < 0.35) {
            System.out.println("Oh no! You meet a furious dog on the backyard of the farm!!");
            System.out.println("Let's see who win this fight");
            System.out.println();
            fight = new Fight(hero, new Dog("Big and furious dog", 40, 15));

            this.dog = new Dog("Big and furious dog", 40, 15);
            heroIsAlive = fight.startFight();

        //Fight with FarmerBoss
        } else if (randomiseAdventure < 0.7) {
            System.out.println("Yough! You meet the insane farmer in the carrot field! ");
            System.out.println("Let's hope you win this fight");
            fight = new Fight(hero, new FarmerBoss("Insane farmer", 60, 30));
            heroIsAlive = fight.startFight();

        //SafePlace
        } else {
            safePlace.visitSafePlace(hero);
        }
        return heroIsAlive;
    }
}
