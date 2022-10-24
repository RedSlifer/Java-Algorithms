import java.util.ArrayList;
import java.util.Scanner;

public class CountLettersInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Character> letters = new ArrayList<>();
        int[] counterLetter = new int[26];
        char sentinel;

        System.out.println("Enter the letters, press 0 to finish.");

        while(true) {
            sentinel = input.next().charAt(0);

            if(sentinel != '0') {
                letters.add(Character.toLowerCase(sentinel));
            }
            else {
                break;
            }
        }

        for(char letter : letters) {
            counterLetter[letter - 'a']++;
        }

        for(int i = 0; i < 26; i++) {
            System.out.printf("%c : %d\n", 97 + i, counterLetter[i]);
        }
    }
}
