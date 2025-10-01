package org.game;

public class Eagle extends Monster{

    public Eagle(String name, int xpReward, int goldReward, int power) {
        super(name, xpReward, goldReward, power);
    }

    @Override
    public int attack(int power) {
        int damage;
        return damage = power;
    }

    int getxpReward() {
        return xpReward;
    }

    void print() {
        System.out.println("Eagle was created");
    }
}
