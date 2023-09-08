import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double R, L ,S;

        System.out.print("Enter area S = ");
        S = in.nextDouble();

        R = Math.sqrt(S / Math.PI);
        L = 2 * Math.PI * R;

        System.out.printf("For a circle with area S = %.2f, radius R = %.2f, circumference L = %.2f.", S, R, L);
        in.close();
    }
}