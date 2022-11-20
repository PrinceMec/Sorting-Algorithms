import java.util.*;

public class BubbleSorting {

    static void printElements(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = { 9, 2, 7, 8, 3, 5, 60, 34, 7, 1 };

        // Bubble Sorting
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        printElements(arr);
    }
}
