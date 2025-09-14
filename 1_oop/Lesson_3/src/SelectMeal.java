import java.util.Scanner;

public class SelectMeal {
    public static void main(String[] args) {

        int meal;
        System.out.println("Ange en måltid:  \n 1. Frukost\n 2. Lunch\n 3. Middag");
        Scanner sc = new Scanner(System.in);
        meal = sc.nextInt();
        switch (meal) {
            case 1:
                System.out.println("Gröt och ägg");
                break;
            case 2:
                System.out.println("köttbullar och lingon");
                break;
            case 3:
                System.out.println("Oxbringa och rotmos");
                break;
        }
    }
    /*Skriv ett program som tar en vardagsmåltid som inmatning (t.ex. "frukost", "lunch", "middag") och skriver ut en
    rekommenderad måltid. Använd en switch-sats.*/

}

