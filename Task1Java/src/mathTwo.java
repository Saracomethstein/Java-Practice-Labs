import java.util.Scanner;

public class mathTwo {
    public  static void main(String[] argc){
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter X: ");
        double x = in.nextDouble();
        double F = x / 3 + Math.pow((x / 3),2) + 1;
        System.out.printf("Result = %.2f", F);
    }
}
