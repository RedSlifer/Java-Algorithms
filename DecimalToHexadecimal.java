import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = input.nextInt();

        String hexadecimalNumber = "";

        while(decimalNumber != 0) {
            int remainder = decimalNumber % 16; //remainders of divisions are saved to generate hexadecimal number
            char hexadecimalDigit = (0 <= remainder && remainder <= 9) ? (char)(remainder + '0') : (char)(remainder - 10 + 'A');

            hexadecimalNumber = hexadecimalDigit + hexadecimalNumber; //concatenate remainders do generate hexadecimal number
            decimalNumber = decimalNumber / 16; //the quotients are saved to be divided again.
        }
        System.out.println("The hex number is " + hexadecimalNumber);
    }
}
