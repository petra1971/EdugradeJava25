package org.game.utils;
import java.util.Scanner;

public class InputReader {
    private Scanner scanner;

    public InputReader(){
        this.scanner = new Scanner(System.in);
    }

    //Method to read int with error handling
    public int readInt(String prompt) {
        System.out.print(prompt + ": ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Enter an integer!");
            System.out.println();
            scanner.next(); //Erase line break from buffer
            System.out.print(prompt + ": ");
        }
        int value = scanner.nextInt();
        scanner.nextLine(); //Erase line break from buffer
        return value;
    }

    //Method to read a line inkluding empty char
    //Uses nextLine() that reads until next line break (Enter)
    public String readString(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }

    //Method to read a word including empty character
    public String readWord(String prompt) {
//        System.out.print(prompt + " : ");
        String word = scanner.next();
        scanner.nextLine();  //Erase line break from buffer
        return word;
    }

    //Method to read a char incl error handling
    public char readYesOrNo() {
        char character;
        String input = scanner.next();

        while (!scanner.hasNext() || !(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N"))) {
            System.out.println("Invalid input");
            input = scanner.next();
        }
        character = input.charAt(0); //Get first character
        return character;
    }

    //Stänga scannerklassen för att frigöra minne
    public void close() {
        scanner.close();
    }
}
