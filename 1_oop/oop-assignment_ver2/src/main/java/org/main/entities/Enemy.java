package org.main.entities;

public abstract class Enemy extends Character{

    protected int xpReward;
    protected int carrotReward;

    public Enemy(String name, int maxHp) {
        super(name, maxHp);
    }
    //Kunde implementerats redan i Enemy men pga kraven i inlämningsuppgiften behövde den göras abstract redan i Character-klassen
    abstract int attack();

    @Override
   public void takeDamage(int damage) {
        hp -= damage;
        if (!isAlive()) {
            System.out.println(name + " took damage and died!");
        } else
            System.out.println(name + " took " + damage + " damage. Hp is now " + hp);
    }


}
