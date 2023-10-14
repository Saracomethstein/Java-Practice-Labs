import  java.util.Scanner;

public class mathOperations {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter first num: ");
        int num1 = in.nextInt();
        System.out.printf("Enter second num: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        int min = num1 - num2;
        int mul = num1 * num2;
        double div = num1 / num2;

        System.out.printf("Result:\nSum = %d,\nMin = %d,\nMul = %d,\nDiv = %.2f", sum, min, mul, div);
        in.close();
    }
}
