package org.main.entities;

import org.main.utils.Helper;

public class Farmer extends Enemy {

    public Farmer(String name, int maxHp) {
        super(name, maxHp);
    }

    @Override
    public int attack() {
        double randomisor = Helper.random();
        int baseDamage = Helper.randomInt(15);
        if (randomisor > 0.7) {
            damage = 2 * baseDamage;
            System.out.println("Oh no! " + name + " attacks with double damage " + damage);
        } else {
            damage = baseDamage;
            System.out.println(name + " attacks with damage " + damage);
        }
        return damage;
    }
}
