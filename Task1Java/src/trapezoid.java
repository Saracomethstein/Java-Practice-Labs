import java.util.Scanner;

public class trapezoid {
    public static void main(String[] argc){
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter bases A: ");
        double basesA = in.nextDouble();
        System.out.printf("Enter bases B: ");
        double basesB = in.nextDouble();
        System.out.printf("Enter heights h: ");
        double heights = in.nextDouble();

        double area = (basesA + basesB) * heights / 2;
        System.out.printf("Area = %.2f", area);
        in.close();
    }
}
