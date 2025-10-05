package org.game.gameEngine;

import org.game.entities.*;
import org.game.utils.Helper;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("KillerRabbit");
        MenuSystem menuSystem = new MenuSystem(hero);
        menuSystem.start();

//        //TEST SECTION
//        //Test Weapon class
//        System.out.println("Test weapon class");
//
//        //Test Dog class
//        System.out.println("Test dog class");
//        dog.status();
//        System.out.println(dog.getName() + " gives " + dog.getXpReward() + " in XP reward");
//
        //Test helper methods
//        System.out.println("Test helper methods");
//        System.out.println("Random value: " + Helper.randomInt(20));
//        System.out.println("Sleep...");
//        Helper.sleepForMilliseconds(900);

//        //Test Hero attack and dog take damage
//        dog.takeDamage((hero.attack()));
//        hero.takeDamage(dog.attack());

    }
}