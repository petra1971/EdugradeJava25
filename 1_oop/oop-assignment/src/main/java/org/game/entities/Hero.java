package org.game.entities;

public class Hero extends org.game.entities.Character {
    private int basicDamage = 10;
    private Weapon weapon = new Weapon("Teeth", 5);
    private int xp = 0;
    private int level = 1;

    public Hero(String name) {
        super(name);
    }

    public void gainWeapon(Weapon newWeapon) {
        weapon = newWeapon;
    }

    @Override
    public int attack() {
        int totalDamage = basicDamage + weapon.getDamage();
        System.out.println("Hero attacks with " + weapon.getName() + " and total power of " + totalDamage);
        return totalDamage;
    }

    public void status() {
        System.out.println("Name is " + name + ", basic damage " + basicDamage + ", weapon " + weapon + ", health " + health + "/" + maxHealth);
    }
}
