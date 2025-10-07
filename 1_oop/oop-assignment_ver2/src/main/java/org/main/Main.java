package org.main;

import org.main.entities.Hero;
import org.main.entities.Weapon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        testWeapon();
        testHero();
    }

    // Test Weapon class
    static void testWeapon () {
        Weapon weapon = new Weapon("Gun", 10);
        System.out.println("Name: " + weapon.getName() + ", damage= " + weapon.getDamage());
    }

    //Test Hero class
    static void testHero() {
        Hero hero = new Hero("KillerRabbit", 100, 10);
        System.out.println("Hero is alive: " + hero.isAlive());
        hero.attack();
        hero.takeDamage(90);
        hero.gainXp(100);
        hero.status();
        hero.levelUp();
        hero.status();
    }
}