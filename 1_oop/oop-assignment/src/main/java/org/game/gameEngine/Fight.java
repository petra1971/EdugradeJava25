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

        int round = 1;
        int maxRounds = 10;

        System.out.println("Fight begins! ");
        hero.status();
        System.out.println();
        Helper.sleepForMilliseconds(4000);

        while (hero.isAlive() && enemy.isAlive()) {
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
                System.out.println();
            }
            round++;
            Helper.sleepForMilliseconds(3000);
            if (round >= maxRounds) {
                System.out.println("Fight is over, both got exhausted and no one won this time");
                break;
            }
        }
        //Who won?
        if (hero.isAlive()) {
            //Hero is alive
            hero.gainXp(enemy.getXpReward());
            hero.gainCarrots(enemy.getCarrotReward());
//            hero.levelUp(enemy.getHealthReward());
            System.out.println("Congratulations! You won the fight! " + hero.getName() +" gained " + enemy.getXpReward()
                    + " XP and " + enemy.getCarrotReward() + " carrots.");
            hero.status();

        } else {
            System.out.println("Fight is over! " + hero.getName() + " died.");
        }
    }
}
