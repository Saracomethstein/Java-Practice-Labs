import java.util.Scanner;

public class volumeOfTheBall {
    public static void main(String[] argc) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter radius of ball: ");
        double radius = in.nextDouble();
        double volume = 4./3 * Math.PI * Math.pow(radius,3);
        System.out.printf("Volume of the ball is: %.2f", volume);
        in.close();
    }
}
