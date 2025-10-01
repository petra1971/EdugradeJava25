package org.game;

public class Hero extends Character {
    private int power = 10;
    private int xp = 0;
    private int level = 1;
    private Weapon weapon;

    public Hero(String name) {
        super(name);
    }

    void attack(int value) {
        power += value;
        //En styrka sätts som jämförs med Monstrets styrka. Högst styrka vinner. Vapen ger extra styrka
        // Den som förlorar tar damage. När health är 0 för den ena är rundan slut. Hero får mer xp (gainXp())
        //och även eventuellt guld. Hälsan återställs till max.
}
}
