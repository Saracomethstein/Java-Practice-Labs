import  java.util.Scanner;

public class areaOfARectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Add first side: ");
        int side1 = in.nextInt();

        System.out.printf("Add second side: ");
        int side2 = in.nextInt();

        int S = side1 * side2;

        System.out.printf("Result = %d", S);
        in.close();
    }
}