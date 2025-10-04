package org.game.entities;

import org.game.utils.Helper;

public class Place {
    private String name;
    private int gold;
    private int xpReward;
    private boolean safePlace;

    public Place(String name) {
        this.name = name;
        this.gold = Helper.randomInt(5);
    }

    public Place(String name, int gold, int xpReward, boolean safePlace) {
        this.name = name;
        this.gold = gold;
        this.xpReward = xpReward;
        this.safePlace = safePlace;
    }
}
