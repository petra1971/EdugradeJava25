import java.util.Scanner;

public class EvenOddNumber {

    public static void main(String[] args) {
        //Jämnt eller udda tal
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ange ett tal: ");
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Talet är jämnt");
        } else
            System.out.println("Talet är ojämnt");
    }


/*Lösningsförslag
3. Avancerade Uppgifter för Snabbare Studenter
Uppgift 3.1:
Skriv ett program som simulerar en enkel miniräknare. Användaren matar in två tal och väljer en operation (addition, subtraktion, multiplikation, division). Använd en switch-sats för att utföra den valda operationen och skriv ut resultatet.

Lösningsförslag
Uppgift 3.2:
Skapa ett program som beräknar en rabatt på en produkt baserat på användarens medlemsstatus (t.ex. "guld", "silver", " brons"). Använd en switch-sats för att tillämpa rätt rabatt.

Exempel nivåer av rabatt:

Guld: 20%
Silver: 10%
Brons: 5% */


}
