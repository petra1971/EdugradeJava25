package org.game.utils;

import java.util.Scanner;

public class InputReader {
    private Scanner scanner;

    //Konstruktor
    public InputReader() {
        this.scanner = new Scanner(System.in);
    }

    //Metod för att läsa int med felhantering
    public int intReader(String prompt) {
        System.out.print(prompt + " : ");

        // Loopar tills användaren skriver in ett giltigt heltal
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input");
            System.out.print(prompt + " : ");
        }
        int value = scanner.nextInt();
        scanner.nextLine(); //Rensa bort radbrytning som blir kvar i bufferten
        return value;
    }

    //Metod för att läsa in hel rad inkl mellanslag
    // Använder nextLine() som läser in fram till nästa radbryt (Enter)
    public String readString(String prompt) {
        System.out.print(prompt + " : ");
        return scanner.nextLine();
    }

    //Metod för att läsa in ett ord exkl mellansla
    public String readWord(String prompt) {
        System.out.print(prompt + " : ");
        String word = scanner.next();
        scanner.nextLine();  // Rensa bort radbrytning som blir kvar i bufferten
        return word;
    }

    //Stänga scannerklassen för att frigöra minne
    public void close() {
        scanner.close();
    }
}
