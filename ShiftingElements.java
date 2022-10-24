public class ShiftingElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int temporary = array[0];

        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }

        array[array.length - 1] = temporary;

        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
