package org.main.entities;

import org.main.utils.Helper;

public class Dog extends Enemy{

    public Dog(String name, int maxHp, int damage) {
        super(name, maxHp, damage);
    }

    @Override
    public int attack() {
        damage = Helper.randomInt(20);
        System.out.println(name + " attacks with damage " + damage);
        return damage;
    }
}
