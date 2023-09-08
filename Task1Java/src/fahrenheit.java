import java.util.Scanner;

public class fahrenheit {
    public static void main(String[] argc){
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter temperature in Celsius: ");
        double celsius = in.nextDouble();

        double F = 9/5 * celsius + 32;
        double K = celsius + 273;

        System.out.printf("This temperature in Fahrenheit = %.2f and Kelvins = %.2f.", F, K);
        in.close();
    }
}
