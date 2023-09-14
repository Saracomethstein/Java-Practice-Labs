public class sumOfLastDigits {
    public static void main(String[] argc){
        int numOne = 124;
        int numTwo = 456;
        int sum = numOne % 10 + numTwo % 10;
        System.out.printf("Sum of last digits = %d", sum);
    }
}
