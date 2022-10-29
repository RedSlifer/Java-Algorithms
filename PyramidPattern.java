import java.util.ArrayList;
import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> pyramid = new ArrayList<>();
        int numberOfLines, elementsPerRow = 1, numberOfBlankSpaces = 0;

        System.out.print("Enter the number of lines: ");
        numberOfLines = input.nextInt();

        for(int i = 0; i < numberOfLines; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            int middle = elementsPerRow / 2;

            for (int j = 0; j <= middle; j++) { row.add((int)Math.ceil(Math.pow(2, j))); }
            for(int j = middle - 1; j >= 0; j--) { row.add(row.get(j)); }

            pyramid.add(row);
            elementsPerRow+=2;
        }

        //TODO
        //Make a logic to deal with numbers that have more than one digit.

        for(ArrayList<Integer> line : pyramid) {
            for(int i = numberOfBlankSpaces; i < numberOfLines - 1; i++) {
                System.out.print(" ");
            }
            for(int element : line) {
                System.out.print(element);
            }
            System.out.println();
            numberOfBlankSpaces++;
        }
    }
}
