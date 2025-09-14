import java.util.Scanner;

public class Practice_2and_3 {
    public static void main(String[] args) {

        System.out.println(10 + 20);
        System.out.println(100-30);
        System.out.println(5*7);
        System.out.println(20/4);
        System.out.println(10%3);

        int a = 15;
        int b = 20;

        System.out.println("a= " + a + " b= " + b);
        System.out.println("a == b: " + (a == b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a <= b: " + (a <= b));

        int x = 19, y = 5, z = 20;
        System.out.println("x > y  OCH z > y: " + (x > y && z > y));
        System.out.println("x > y || z  < y: " + (x > y || z < y));
        System.out.println("!(x > y): " + !(x > y));
        System.out.println("(10+5)*2>20: " + ((10 + 5) * 2 > 20));

        int c, d, e;
        Scanner input = new Scanner(System.in);
        System.out.print("Ange c: ");
        c = input.nextInt();
        System.out.print("Ange d: ");
        d = input.nextInt();
        System.out.println("Triangelns hypotenusa = " + Math.sqrt(c * c + d * d));


    }
    }

