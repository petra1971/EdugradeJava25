package org.game.gameEngine;

import org.game.entities.Eagle;
import org.game.entities.Hero;
import org.game.entities.Weapon;
import org.game.utils.Helper;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Killer Rabbit game inspired by the comedy \n" +
                "film Monty Python and the Holy Grail.");
        //Test Weapon class
        Weapon weapon = new Weapon("Teeth", 10);
        weapon.printInfo();

        //Test Eagle class
        Eagle eagle = new Eagle("Grey eagle", 10, 2, 15);
        eagle.status();
        System.out.println(eagle.getName() + " gives " + eagle.getXpReward() + " in XP reward");

        //Test helper methods
        System.out.println("Random value: " + Helper.randomInt());
        System.out.println("Sleep...");
        Helper.sleepForMilliseconds(900);

        //Test Hero attack and eagle take damage
        Hero hero = new Hero("KillerRabbit");
        hero.gainWeapon(weapon);
        eagle.takeDamage((hero.attack()));

        //Test Eagle attack and Hero take damage
        hero.takeDamage(eagle.attack());

        //Avsluta scannern sist
    }
}