package org.game.gameEngine;

import org.game.entities.Hero;
import org.game.utils.InputReader;

import java.sql.SQLOutput;

public class Menu {

    public static void menu(Hero hero) {
        Adventure adventure = new Adventure();
        int choise;

        System.out.println("\nWelcome to the Killer Rabbit game inspired \n" +
                "by the comedy film \"Monty Python and the Holy Grail\".");
        System.out.println();

        while (true) {
            System.out.println();
            System.out.println("GAME MENU");
            System.out.println("------------------");
            System.out.println("1. Go on adventure");
            System.out.println("2. Show info");
            System.out.println("3. End game");
            System.out.println("------------------");
            System.out.print("Make your selection: ");

            choise = InputReader.intReader("Select 1, 2, or 3: ");
            System.out.println();

            switch (choise) {
                case 1:
                    adventure.startAdventure(hero);
                    break;
                case 2:
                    hero.status();
                    break;
                case 3:
                    System.out.println("Game ends. Welcome back!");
                    System.exit(0);
            }
        }
    }
}
