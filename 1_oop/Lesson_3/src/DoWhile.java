import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        int number = 0;
        while (number < 100) {
            System.out.println(number);
            number+=2;
        }

        while (number > 0) {
            System.out.print("Ange ett tal: ");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            System.out.println("Talet i kvadrat är: " + number * number);
        }
        number = 0;

        do {
            System.out.println("Koda är kul");
            number++;
        } while (number <= 50);


// Ongoing, primtal
        for (int tal = 1; tal <= 100; tal++) {
            for (int j = 1; j < tal; j++) {
                if (tal % j == 0) {
                    break;
                }
                System.out.println(tal);
            }

        }
    }

}
/*
Uppgift 4.1:
Skriv ett program som använder en for-loop för att generera alla primtal mellan 1 och 100 och skriver ut dem. Ett primtal är ett tal som endast är delbart med 1 och sig självt.

Lösningsförslag
Uppgift 4.2:
Skapa ett program som använder både en for-loop och en while-loop för att beräkna Fibonacci-sekvensen upp till ett visst antal termer.*/