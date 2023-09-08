import java.util.Scanner;

public class mathOne {
    public static void main(String[] argc){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter X: ");
        double X = in.nextDouble();
        System.out.print("Enter Y: ");
        double Y = in.nextDouble();
        System.out.print("Enter Z: ");
        double Z = in.nextDouble();

        double a = X * Y * Math.sqrt(Math.abs(Z));
        double b = 1 + 1 / Math.tan(3 * Z / 17);
        System.out.printf("Result A = %.2f, result B = %.2f", a, b);
        in.close();
    }
}
