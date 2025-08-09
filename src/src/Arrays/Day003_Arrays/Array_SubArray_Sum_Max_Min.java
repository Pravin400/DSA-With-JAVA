package Arrays.Day003_Arrays;

public class Array_SubArray_Sum_Max_Min {

    public static void main(String[] args) {
        int[] number = {2, 3, 4, 5, 6, 7, 8};

        // Store subarray sums
        int[] subArray_Sum = new int[(number.length * (number.length + 1) / 2)];
        subArray(number, subArray_Sum);

        // Find maximum and minimum
        maximum(subArray_Sum);
        minimum(subArray_Sum);
    }

    // Find minimum subarray sum
    private static void minimum(int[] subArraySum) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < subArraySum.length; i++) {
            if (subArraySum[i] < min) {
                min = subArraySum[i];
            }
        }
        System.out.println("Minimum subarray sum: " + min);
    }

    // Find maximum subarray sum
    private static void maximum(int[] subArraySum) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < subArraySum.length; i++) {
            if (subArraySum[i] > max) {
                max = subArraySum[i];
            }
        }
        System.out.println("Maximum subarray sum: " + max);
    }

    /**
     * Generates sums of all contiguous subarrays and stores them in subArraySum[]
     *
     * @param number       the input array
     * @param subArraySum  array to store subarray sums
     */
    public static void subArray(int[] number, int[] subArraySum) {
        int count = 0; // Counter to keep track of total subarrays

        // Outer loop - chooses the starting index of subarray
        for (int i = 0; i < number.length; i++) {

            // Inner loop - chooses the ending index of subarray
            for (int j = i; j < number.length; j++) {

                int tempSum = 0;

                // Calculate sum of current subarray
                for (int k = i; k <= j; k++) {
                    tempSum += number[k];
                }

                // Store subarray sum
                subArraySum[count] = tempSum;

                // Print subarray sum
                System.out.println("Subarray sum: " + tempSum);

                count++; // Increment total subarray count
            }
            System.out.println();
        }

        // Print all stored subarray sums
        System.out.print("All subarray sums: ");
        for (int c : subArraySum) {
            System.out.print(c + " ");
        }

        // Display total subarray count
        System.out.println("\nTotal SubArrays = " + count);
        System.out.println("Total SubArrays Using Formula = "
                + ((number.length * (number.length + 1)) / 2));
    }
}
