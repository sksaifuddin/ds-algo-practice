// Count elements of an array in another one
// Implement a method to search the count of occurrence values from the first array in the second one. The method must return an array of counts with the same size as the first array.

// Both arrays are not empty; values may repeat in arrays.


// Sample Input:
// 15 10 18 17 15
// 10 10 15 10 17 17

// Sample Output:
// 1 3 0 2 1

import java.util.Arrays;
import java.util.Scanner;

public class countElement {

    public static int[] countOccurrences(int[] first, int[] second) {
        // write your code here
        int result[] = new int[first.length];

        for (int i = 0; i < first.length; i++) {
            int count = 0;
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    count++;
                }
            }
            result[i] = count;
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
        final String result = Arrays.toString(countOccurrences(first, second))
                .replace(", ", " ")
                .replace("[", "")
                .replace("]", "");
        System.out.println(result);
    }
}