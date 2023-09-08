import java.util.Scanner;

public class mathThree {
    public static void main(String[] argc){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter X: ");
        double x = in.nextDouble();
        System.out.print("Enter Y: ");
        double y = in.nextDouble();

        double a = x - 1 / 1 + Math.pow(x, 1) / 2 + Math.pow(y,4) / 4;
        System.out.printf("Result = %.2f", a);
        in.close();
    }
}
