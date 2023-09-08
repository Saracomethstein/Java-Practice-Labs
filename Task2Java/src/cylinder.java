import java.util.Scanner;

public class cylinder {
    public static void main(String[] argc){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter height H: ");
        double H = in.nextDouble();
        System.out.print("Enter radius R: ");
        double R = in.nextDouble();

        double V = Math.PI * Math.pow(R, 2) * H;
        double S = 2 * Math.PI * Math.pow(R,2) + 2 * Math.PI * R * H;

        System.out.printf("Result:\nVolume = %.2f\nArea = %.2f", V, S);
        in.close();
    }
}
