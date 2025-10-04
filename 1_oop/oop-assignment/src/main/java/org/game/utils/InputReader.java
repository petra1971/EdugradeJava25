package org.game.utils;
import java.util.Scanner;

public class InputReader {
    private static final Scanner scanner = new Scanner(System.in);

    //Method to read int with error handling
    public static int intReader(String prompt) {
//        System.out.print(prompt + " : ");

        // Loops until user write a valid integer
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input");
            System.out.print(prompt + " : ");
        }
        int value = scanner.nextInt();
        scanner.nextLine(); //Rensa bort radbrytning som blir kvar i bufferten
        return value;
    }

    //Method to read a line inkluding empty char
    //Uses nextLine() that reads until next line break (Enter)
    public static String readString(String prompt) {
        System.out.print(prompt + " : ");
        return scanner.nextLine();
    }

    //Method to read a word including empty character
    public static String readWord(String prompt) {
        System.out.print(prompt + " : ");
        String word = scanner.next();
        scanner.nextLine();  // Rensa bort radbrytning som blir kvar i bufferten
        return word;
    }

    //Method to read a char incl error handling
    public static char readChar(String prompt) {
        char character;
        System.out.println(prompt + " : ");
        String input = scanner.next();

        while (input.isEmpty() || !(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N"))) {
            System.out.println(prompt + " : ");
            input = scanner.next();
        }
        character = input.charAt(0); //Get first character
        return character;
    }

    //Stänga scannerklassen för att frigöra minne
    public static void close() {
        scanner.close();
    }
}
