package org.game.entities;

import org.game.utils.Helper;

public class Place {
    private String name;
    private int gold;
    private int xpReward;
    private boolean safePlace;

    public Place(String name) {
        this.name = name;
        this.gold = Helper.randomInt();
    }
}
