import java.util.Scanner;

public class Objects {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ange rektangelns bredd: ");
        int width = sc.nextInt();

        System.out.print("Ange rektangelns längd: ");
        int length = sc.nextInt();

        Rectangle rectangle = new Rectangle(width, length);

        System.out.println("Rektangelns area är: " + rectangle.calculateArea());
            }

    public static class Rectangle {
        public int width;
        public int length;
        public int area;

        public Rectangle(int width, int length) {
            this.width = width;
            this.length = length;
        }

        int calculateArea() {
            int area;
            return area = width * length;
        }

    }
}
