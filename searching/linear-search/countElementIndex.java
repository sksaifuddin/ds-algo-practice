// Search indexes of values in another array
// Implement a method to search the index of the first occurrence of each value from the first array in the second one. If a value is not found in the second array, the index is -1. The method must return an array of indexes the same size as the first array.

// Both arrays are not empty; values may repeat in arrays.


// Sample Input:
// 15 10 18 17 15
// 10 15 10 17

// Sample Output:
// 1 0 -1 3 1

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] searchIndexes(int[] first, int[] second) {
        // write your code here
        int result[] = new int[first.length];

        for (int i = 0; i < first.length; i++) {
            int index = -1;
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    index = j;
                    break;
                }
            }
            result[i] = index;
        }

        return  result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] first = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        final int[] second = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        final String result = Arrays.toString(searchIndexes(first, second))
                .replace(", ", " ")
                .replace("[", "")
                .replace("]", "");
        System.out.println(result);
    }
}