package org.main;

import org.main.entities.Dog;
import org.main.entities.Farmer;
import org.main.entities.Hero;
import org.main.entities.Weapon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        testWeapon();
//        testHero();
        testDog();
        System.out.println("-------------------");
        testFarmer();
    }

    // Test Weapon class
    static void testWeapon() {
        Weapon weapon = new Weapon("Gun", 10);
        System.out.println("Name: " + weapon.getName() + ", damage= " + weapon.getDamage());
    }

    //Test Hero class
    static void testHero() {
        Hero hero = new Hero("KillerRabbit");
        System.out.println(hero.getName() +" is alive: " + hero.isAlive());
        hero.attack();
        hero.takeDamage(90);
        hero.gainXp(100);
        hero.status();
        hero.levelUp();
        hero.status();
    }

    //Test Dog class
    static void testDog() {
        Dog dog = new Dog("Rufus", 100);
        dog.isAlive();
        System.out.println(dog.getName() + " is dog name");

        int sumDamage = 0;
        for (int i = 1; i <= 100; i++) {
            sumDamage += dog.attack();
        }
        System.out.println("Medium damage = " + sumDamage / 100);

        dog.takeDamage(20);
    }

    //Test Farmer
    static void testFarmer() {
        Farmer farmer = new Farmer("Insane Farmer", 100);
        int sumDamage = 0;
        for (int i = 1; i <= 100; i++) {
            sumDamage += farmer.attack();
        }
        System.out.println("Medium damage = " + sumDamage / 100);

        farmer.takeDamage(20);
    }
}