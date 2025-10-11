package org.main.entities;

public class Hero extends Character {
    private int xp;
    private final int MAX_XP;
    private int carrots;
    private int level;
    private final int MAX_LEVEL;
    private Weapon weapon;

    public Hero(String name) {
        super(name, 100);
        this.xp = 0;
        this.MAX_XP = 100;
        this.carrots = 0;
        this.level = 1;
        this.MAX_LEVEL = 10;
        this.damage = 20;
    }

    @Override
    public int attack() {
        System.out.println(name + " attacks with damage " + damage);
        return damage;
    }

    @Override
    public void takeDamage(int damage) {
        hp -= damage;
        if (isAlive()) {
            System.out.println(name + " took " + damage + " damage. Hp is now " + hp + "/" + maxHp);
        } else {
            hp = 0;
            System.out.println(name + " took damage and died.");
            status();
        }
    }

    public void gainXp(int xpReward) {
        xp += xpReward;
        System.out.println("xp incl reward: "+  xp);
        if (xp >= maxHp) {
            levelUp();
        }
        hp = maxHp;
        System.out.println("hp=maxHP: " + hp);
        //TODO: fix so HP and XP get correct "KillerRabbit status: Level = 2, HP = 100/110,XP: -100/0, carrots: 0
    }

    public void levelUp() {
        System.out.println("Before level up, level is " + level);
        System.out.println("XP before level up is: " + xp);
        if (level <= MAX_LEVEL) {
            level++;
            xp = xp - MAX_XP;
            System.out.println("Level after is " + level);
//            if ((xp = xp - MAX_XP) < 0) {
//                xp = 0;
//            }
            System.out.println("xp after level up is " + xp);
            maxHp += 10;
        } else {
            System.out.println("YOU REACHED LEVEL 10 AND WON THE GAME");
        }
    }

    public void gainWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void status(){
        System.out.println(name + " status: Level = " + level + ", HP = " + hp + "/" + maxHp + ", XP: " + xp
                + "/" + MAX_XP + ", carrots: " + carrots);
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getCarrots() {
        return carrots;
    }

    public void setCarrots(int carrots) {
        this.carrots = carrots;
    }

    public int getLevel() {
        return level;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}

