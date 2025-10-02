package org.game.entities;

public class FarmerBoss extends Enemy{

    public FarmerBoss(String name, int xpReward, int goldReward, int power) {
        super(name, xpReward, goldReward, power);
    }

    @Override
    int attack() {
        return 0;
    }

    @Override
    public void status() {
        System.out.println("Farmers status will be written here");
    }

}
