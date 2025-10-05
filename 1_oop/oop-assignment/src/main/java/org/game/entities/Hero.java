package org.game.entities;

public class Hero extends Character {
    private int xp;
    private int maxXp;
    private int level;
    private int carrots;
    private Weapon weapon;

    public Hero(String name) {
        super(name, 100);
        super.damage = 15;
        this.xp = 0;
        this.maxXp = 100;
        this.level = 1;
        this.carrots = 0;

        System.out.println(name + damage + xp + maxXp + level + carrots);
    }

    @Override
    public int attack() {
        System.out.println(name + " attacks with damage " + damage);
        return damage;
    }

    //Get a new weapon
    public void gainWeapon(Weapon newWeapon) {
        damage += newWeapon.getDamage();
    }

    //Get more XP when e.g. fight is won
    public void gainXp(int moreXp) {
        xp = xp + moreXp;
        //Enough xp to level up?
        if (xp >= 100)
            levelUp();
        health = super.getMaxHealth();
    }
    //Level up
    public void levelUp() {
            while (level <= 10) {
                level = level + 1;
                xp = xp - 100;
                super.maxHealth += 20;
            }
            System.out.println("YOU REACHED LEVEL 10 AND WON THE GAME");
    }

    //Reset health e.g. when a fight is won
    public void heal() {
        super.health = super.maxHealth;
    }

    //Gain carrots when fight is won or carrots found in secure place
    public void gainCarrots(int moreCarrots) {
        carrots += moreCarrots;
        //TODO: Add actions for carrot such as write how many carrot hero has
        // and how many are left until it's time for shopping or if it's enough for shopping already
    }

    //Getters
    public int getLevel() {
        return level;
    }

    public int getCarrots() {
        return carrots;
    }

    @Override
    public void status() {
        System.out.println(name + " status: Level = " + level + ", HP = " + health + "/" + maxHealth + ", XP: " + xp
                + "/" + maxXp + ", carrots: " + carrots);
    }
}
