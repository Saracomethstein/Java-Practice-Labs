import java.util.Scanner;

public class petagon {
    public static void main(String[] argc) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Add side 1: ");
        double side1 = in.nextDouble();

        System.out.printf("Add side 2: ");
        double side2 = in.nextDouble();

        System.out.printf("Add side 3: ");
        double side3 = in.nextDouble();

        System.out.printf("Add side 4: ");
        double side4 = in.nextDouble();

        System.out.printf("Add side 5: ");
        double side5 = in.nextDouble();

        double P = side1 + side2 + side3 + side4 + side5;
        System.out.printf("Perimeter = %.2f", P);
        in.close();
    }
}
