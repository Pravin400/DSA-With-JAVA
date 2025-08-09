package Arrays.Day003_Arrays;

/**
 * This program:
 * 1. Calculates the sum of all possible contiguous subarrays of a given array.
 * 2. Finds the maximum and minimum subarray sums.
 * 3. Displays all subarray sums and total subarray count.
 *
 * Formula for total subarrays = n * (n + 1) / 2
 */
public class Array_SubArray_Sum_Max_Min {

    public static void main(String[] args) {
        // Input array
        int[] number = {2,4,6,8,10};

        // Array to store subarray sums
        int[] subArray_Sum = new int[(number.length * (number.length + 1) / 2)];

        // Generate subarray sums
        subArray(number, subArray_Sum);

        // Find and display maximum subarray sum
        maximum(subArray_Sum);

        // Find and display minimum subarray sum
        minimum(subArray_Sum);
    }

    /**
     * Finds the minimum subarray sum in the given array of sums.
     *
     * @param subArraySum array containing sums of all subarrays
     */
    private static void minimum(int[] subArraySum) {
        int min = Integer.MAX_VALUE;

        for (int sum : subArraySum) {
            if (sum < min) {
                min = sum;
            }
        }

        System.out.println("Minimum subarray sum: " + min);
    }

    /**
     * Finds the maximum subarray sum in the given array of sums.
     *
     * @param subArraySum array containing sums of all subarrays
     */
    private static void maximum(int[] subArraySum) {
        int max = Integer.MIN_VALUE;

        for (int sum : subArraySum) {
            if (sum > max) {
                max = sum;
            }
        }

        System.out.println("Maximum subarray sum: " + max);
    }

    /**
     * Generates sums of all contiguous subarrays and stores them in subArraySum[].
     * Also prints each sum and counts the total number of subarrays.
     *
     * @param number      the input array
     * @param subArraySum array to store subarray sums
     */
    public static void subArray(int[] number, int[] subArraySum) {
        int count = 0; // Counter for total subarrays

        // Outer loop: choose starting index
        for (int i = 0; i < number.length; i++) {

            // Inner loop: choose ending index
            for (int j = i; j < number.length; j++) {

                int tempSum = 0;

                // Calculate sum of current subarray
                for (int k = i; k <= j; k++) {
                    tempSum += number[k];
                }

                // Store subarray sum
                subArraySum[count] = tempSum;

                // Print sum of current subarray
                System.out.println(tempSum);

                count++; // Increment count of subarrays
            }
            System.out.println(); // Blank line for separation
        }

        // Print all stored subarray sums
        System.out.print("All subarray sums: { ");
        for (int sum : subArraySum) {
            System.out.print(sum + " ");
        }
        System.out.print("}");

        // Display subarray counts
        System.out.println("\nTotal SubArrays = " + count);
        System.out.println("Total SubArrays Using Formula = "
                + ((number.length * (number.length + 1)) / 2));
    }
}
