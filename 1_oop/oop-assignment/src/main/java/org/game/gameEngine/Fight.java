package org.game.gameEngine;
import org.game.entities.Enemy;
import org.game.entities.Hero;
import org.game.entities.SafePlace;
import org.game.utils.Helper;

public class Fight {
    private Hero hero;
    private Enemy enemy;

    public Fight (Hero hero, Enemy enemy) {
        this.hero = hero;
        this.enemy = enemy;
    }
    public boolean startFight() {
        int round = 1;
        int maxRounds = 10;
        Helper helper = new Helper();

        while (hero.isAlive() && enemy.isAlive()) {
            System.out.println();
            System.out.println("Round " + round);

            //Hero attacks
            int heroDamage = hero.attack();
            //Enemy take damage
            enemy.takeDamage(heroDamage);

            //If enemy still alive
            if (enemy.isAlive()) {
                //Enemy attacks
                int enemyDamage = enemy.attack();
                //And hero take damage
                hero.takeDamage(enemyDamage);
                System.out.println("---------------");
            }
            round++;
            if (round > maxRounds) {
                System.out.println("The " + enemy.getName() + " gave up");
                break;
            }
            Helper.sleepForMilliseconds(1000);
        }
        //Who won?
        if (hero.isAlive()) {
            //Hero is alive
            hero.gainXp(enemy.getXpReward());
            hero.gainCarrots(enemy.getCarrotReward());
            System.out.println("Congratulations! " + hero.getName() + " won the fight! and got " + enemy.getXpReward()
                    + " XP and " + enemy.getCarrotReward() + " carrots in reward.");
            hero.status();

        } else if (enemy.isAlive()) {
            System.out.println("Game over! " + hero.getName() + " died.");

        } else {
            System.out.println("Something went wrong");
        }
        return hero.isAlive();
    }
}
