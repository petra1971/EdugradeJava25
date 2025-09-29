import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HeroRabbit hero = new HeroRabbit();
        EvilCharacter evilCharacter = new EvilCharacter();
        int challenge;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Hello and welcome!");
        System.out.println("Game name and description");
        System.out.println("Select challenge");
        System.out.println("-----------------");
        System.out.println("1. Challenge");
        System.out.println("2. Challenge");
        System.out.println("3. Challenge");
        System.out.println("4. FinalChallenge");
        challenge = sc.nextInt();

        switch (challenge) {
            case 1:
                startChallenge()
        }
        startRace();

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}