public class mathOne {
    public static void main(String[] argc){
        int x = 3;
        double F = 6 * Math.pow(x, 2) + 3 * Math.pow((Math.pow(x, 2) + 1), 2);
        System.out.printf("Result = %.2f", F);
    }
}
