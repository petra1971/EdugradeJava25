package org.game.gameEngine;

import org.game.entities.*;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("KillerRabbit");
        Menu.menu(hero);


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
//        System.out.println("Random value: " + Helper.randomInt(10));
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