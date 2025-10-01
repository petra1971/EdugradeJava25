package org.game;

public class Hero extends Character {
    private int basicPower = 10;
    private Weapon weapon;
    private int totalPower;
    private int xp = 0;
    private int level = 1;

    public Hero(String name) {
        super(name);
    }

    public void gainWeapon(Weapon newWeapon) {
        weapon = newWeapon;
    }

    void attack(int value) {
        totalPower = basicPower + weapon.getPower();
        System.out.println("Hero attacks with " + weapon + " and total power of " + totalPower);
        //En styrka sätts som jämförs med Monstrets styrka. Högst styrka vinner. Vapen ger extra styrka
        // Den som förlorar tar damage. När health är 0 för den ena är rundan slut. Hero får mer xp (gainXp())
        //och även eventuellt guld. Hälsan återställs till max.}
    }
}
