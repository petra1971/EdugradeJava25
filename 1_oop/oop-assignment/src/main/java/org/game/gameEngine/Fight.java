package org.game.gameEngine;
import org.game.entities.Enemy;
import org.game.entities.Hero;
import org.game.entities.Place;
import org.game.utils.Helper;

public class Fight {
    private Hero hero;
    private Enemy enemy;
    private Place place;

    public Fight (Hero hero, Enemy enemy, Place place) {
        this.hero = hero;
        this.enemy = enemy;
        this.place = place;

        int round = 1;
        int maxRounds = 10;

        System.out.print("Fight begins. ");
        System.out.println();

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
//            if (round >= maxRounds)
//                break;
//            else
                Helper.sleepForMilliseconds(4000);
        }
        //Who won?
        if (hero.isAlive()) {
            hero.gainXp(enemy.getXpReward());
            hero.gainCarrots(enemy.getCarrotReward());
//            hero.levelUp(enemy.getHealthReward());
            System.out.println("Congratulations! You won the fight! " + hero.getName() +" gained " + enemy.getXpReward()
                    + " XP and " + enemy.getCarrotReward() + " carrots. \n Level is now " + hero.getLevel());

        } else {
            System.out.println("Fight is over! " + hero.getName() + " died.");
        }
    }
}
