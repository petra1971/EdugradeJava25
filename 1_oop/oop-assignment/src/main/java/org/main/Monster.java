package org.main;

public class Monster extends Character {
    protected int power;
    protected int xpReward;

    public Monster(String name, int xpReward, int power) {
        super(name);
        this.xpReward = xpReward;
        this.power = power;
    }

    //Attack means a force value is set with random value. If strength
    @Override
    void attack(int power) {
        //In a fight, Monster power is compared with Hero/Rabbit power (from its' strength) and highest wins and the looser get damaged (value comes from winner)
    }
}
