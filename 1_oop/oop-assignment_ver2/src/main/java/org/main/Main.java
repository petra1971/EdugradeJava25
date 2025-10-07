package org.main;

import org.main.entities.Weapon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        testWeapon();

    }

    // Test Weapon class
    static void testWeapon () {
        Weapon weapon = new Weapon("Gun", 10);
        System.out.println("Name: " + weapon.getName() + " damage: " + weapon.getDamage());
    }

    //Test
}