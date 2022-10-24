import java.util.Scanner;

public class LeibnizFormulaForPi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double summation = 0;
        int n;

        System.out.print("Enter with value for n: ");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            summation = summation + (Math.pow(-1, i) / ((2 * i) + 1));
        }

        System.out.println("Approximation for Pi with n equals to " + n + " is: " + 4 * summation);
    }
}
