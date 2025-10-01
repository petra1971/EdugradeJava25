package org.game;

public class Hero extends Character {
    private int basicDamage = 10;
    private Weapon weapon;
    private int xp = 0;
    private int level = 1;

    public Hero(String name) {
        super(name);
    }

    public void gainWeapon(Weapon newWeapon) {
        weapon = newWeapon;
    }

    int attack(int value) {
        int totalDamage = basicDamage + weapon.getDamage();
        System.out.println("Hero attacks with " + weapon + " and total power of " + totalDamage);

        return totalDamage;
        //En damage sätts som jämförs med Monstrets damage. Högst damage (skada man åsamkar den andra) vinner. Vapen ger extra damage
        // Den som förlorar tar damage. När health är 0 för den ena är rundan slut. Hero får mer xp (gainXp())
        //och även eventuellt guld. Hälsan återställs till max.}
    }

    @Override
    void status() {
        System.out.println("Name is " + name + ", basic damage " + basicDamage + ", weapon " + weapon + ", health " + health + "/" + maxHealth);
    }
}
