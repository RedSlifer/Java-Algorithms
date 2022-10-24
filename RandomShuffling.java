import java.lang.Math;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class RandomShuffling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String numberString;

        System.out.println("Enter the numbers, press a to finish.");

        while(true) {
            numberString = input.next();

            if(!Objects.equals(numberString.toLowerCase(), "a")) {
                numbers.add(Integer.valueOf(numberString));
            }
            else {
                break;
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            int randomIndex = (int) (Math.random() * numbers.size());

            int auxiliary = numbers.get(i);
            numbers.set(i, numbers.get(randomIndex));
            numbers.set(randomIndex, auxiliary);
        }

        for (int element : numbers) {
            System.out.print(element + " ");
        }
    }
}
