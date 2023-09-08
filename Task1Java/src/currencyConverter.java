import java.util.Scanner;

public class currencyConverter {
    public static void main(String[] argc) {
        Scanner in = new Scanner(System.in);
        System.out.print("Select currency (1 = dollar , 2 = euro): ");
        int menu = in.nextInt();
        switch (menu) {
            case 1 -> Dollar();
            case 2 -> Euro();
            default -> System.out.print("[Error] Invalid value entered!");
        }
    }

    public static void Dollar(){
        Scanner in = new Scanner(System.in);
        System.out.println("How many dollars can you convert to rubles?");
        double dollar = in.nextDouble();

        double rubles = 98.20 * dollar;
        System.out.printf("%.2f dollar in rubles = %.2f", dollar, rubles);
    }

     public static void Euro(){
        Scanner in = new Scanner(System.in);
        System.out.println("How many euro can you convert to rubles?");
        double euro = in.nextDouble();

        double rubles = 105.08 * euro;
        System.out.printf("%.2f euro in rubles = %.2f", euro, rubles);
    }
}
