import  java.util.Scanner;

public class Calculate {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.printf("Add first num: ");
        int num1 = in.nextInt();
        System.out.printf("Add second num: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        int min = num1 - num2;
        int mul = num1 * num2;
        double div = num1 / num2;

        System.out.printf("Sum = %d, Min = %d, Mul = %d, Div = %.2f", sum, min, mul, div);
        in.close();
    }
}
