package org.game.entities;

public class Hero extends Character {
    private int damage = 15;
    private int xp = 0;
    private int maxXp = 100;
    private int level = 1;
    private int carrots = 0;
    private Weapon weapon;

    public Hero(String name) {
        super(name);
    }

    @Override
    public int attack() {
        System.out.println(name + " attacks with damage " + damage);
        return damage;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0)
            health = 0;
        status();
    }

    //Get a new weapon
    public void gainWeapon(Weapon newWeapon) {
        damage += newWeapon.getDamage();
    }

    //Get more XP when e.g. fight is won
    public void gainXp(int moreXp) {
        xp += moreXp;
        //Enough xp to level up?
        if (xp >= 100)
            levelUp();
    }
    //Level up
    public void levelUp() {
        {
            level = level + 1;
            xp -= 100;
            maxHealth += 20;
            heal();
        }
        System.out.println("Congratulations! Your leveled up to level " + level +" and max HP increased to " + maxHealth);
    }

    //Reset health e.g. when a fight is won
    public void heal() {
        health = maxHealth;
    }

    //Gain carrots when fight is won or gold found in secure place
    public void gainCarrots(int moreCarrots) {
        carrots += moreCarrots;
        //TODO: Add actions for carrot such as write how many carrot hero has
        // and how many are left until it's time for shopping or if it's enough for shopping already
    }

    //Getters
    public int getLevel() {
        return level;
    }

    @Override
    public void status() {
        System.out.println(name + " status: Level = " + level + " HP = " + health + "/" + maxHealth + ", XP: " + xp + "/" + maxXp);
    }
}
