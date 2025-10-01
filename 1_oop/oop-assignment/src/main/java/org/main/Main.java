package org.main;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Welcome to the Killer Rabbit game inspired by A console app inspired by the comedy " +
                "film Monty Python and the Holy Grail. The game and is about a rabbit with great appetite " +
                "for blood and not carrots");

        Weapon weapon = new Weapon("Teeth", 10);
        weapon.printInfo();
    }
}