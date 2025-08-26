package Arrays.Day007_ArrayProblem;

import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 2, 2};

        int duplicate = findDuplicate(numbers);

        if (duplicate != -1) {
            System.out.println("Duplicate number is: " + duplicate);
        } else {
            System.out.println("No duplicates found");
        }
    }

    // Optimized solution using HashSet
    private static int findDuplicate(int[] numbers) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : numbers) {
            if (seen.contains(num)) {
                return num; // Found duplicate
            }
            seen.add(num);
        }

        return -1; // No duplicate found
    }
}
