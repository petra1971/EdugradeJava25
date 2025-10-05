package org.game.gameEngine;

import org.game.entities.Dog;
import org.game.entities.FarmerBoss;
import org.game.entities.Hero;
import org.game.entities.SafePlace;
import org.game.utils.Helper;
import org.game.utils.InputReader;

public class MenuSystem {
    private InputReader reader;
    boolean gameIsRunning;  //Global variable
    private Adventure adventure;
    private Hero hero;

    public MenuSystem(Hero hero) {
        this.reader = new InputReader();
        this.gameIsRunning = true;
        this.hero = hero;
        this.adventure = new Adventure(hero);
    }

     public void quitGame() {
        this.gameIsRunning = false;
    }

    public void start() {

        System.out.println("\n === Welcome to the Killer Rabbit game ===");
        System.out.println("inspired by the comedy movie \"Monty Python");
        System.out.println("and the Holy Grail\".");

        while (gameIsRunning) {
            displayMenu();
            int choice = reader.readInt("Make your selection");
            handleChoice(choice);
        }
        reader.close();
    }

    private void displayMenu() {
        System.out.println();
        System.out.println("GAME MENU");
        System.out.println("------------------");
        System.out.println("1. Go on adventure");
        System.out.println("2. Show info");
        System.out.println("3. End game");
        System.out.println("------------------");
    }

    private void handleChoice(int choice) {

        switch (choice) {
            case 1:
                System.out.println("You selected 1. Go on adventure");
                System.out.println();
                if (!adventure.startAdventure()) {
                    quitGame();
                };
                break;
            case 2:
                System.out.println("You selected 2. Info");
                hero.status();
                break;
            case 3:
                System.out.println("You selected 3.");
                System.out.println("Game ends. Welcome back!");
                quitGame();
                break;
            default:
                System.out.println("Invalid choise! Try again!");
        }
    }
}
