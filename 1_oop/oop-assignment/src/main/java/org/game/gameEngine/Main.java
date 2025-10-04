package org.game.gameEngine;

import org.game.entities.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Killer Rabbit game inspired by the comedy \n" +
                "film Monty Python and the Holy Grail.");

        Hero hero = new Hero("KillerRabbit");
        Dog dog = new Dog("Dog", 10, 2);
        FarmerBoss farmerBoss = new FarmerBoss("Insane farmer", 20, 5);
        Place place = new Place("Backyard", 0, 0, false);
        Place safePlace = new Place("Deep whole, ");
        Fight fight = new Fight(hero, dog, place);
//
//        //TEST SECTION
//        //Test Weapon class
//        System.out.println("Test weapon class");
//        Weapon weapon = new Weapon("Teeth", 10);
//        weapon.printInfo();
//
//        //Test Dog class
//        System.out.println("Test dog class");
//        dog.status();
//        System.out.println(dog.getName() + " gives " + dog.getXpReward() + " in XP reward");
//
//        //Test helper methods
//        System.out.println("Test helper methods");
//        System.out.println("Random value: " + Helper.randomInt());
//        System.out.println("Sleep...");
//        Helper.sleepForMilliseconds(900);
//
//        //Test Hero attack and dog take damage
//        dog.takeDamage((hero.attack()));
//        hero.takeDamage(dog.attack());

        //Close scanner
//        InputReader.close();
    }
}