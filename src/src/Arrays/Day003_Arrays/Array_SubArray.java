package Arrays.Day003_Arrays;

public class Array_SubArray {

    public static void main(String[] args) {
        int[] number = {2, 3, 4, 5, 6, 7, 8};
        subArray(number);
    }

    /**
     * Prints all contiguous subarrays of the given array,
     * counts them, and verifies count using the formula n*(n+1)/2.
     *
     * @param number the input array
     */
    public static void subArray(int[] number) {
        int count = 0; // Counter to keep track of total subarrays

        // Outer loop - chooses the starting index of subarray
        for (int i = 0; i < number.length; i++) {

            // Inner loop - chooses the ending index of subarray
            for (int j = i; j < number.length; j++) {

                // Printing current subarray
                System.out.print("{ ");
                for (int k = i; k <= j; k++) {
                    System.out.print(number[k] + " ");
                }
                System.out.println("}");

                count++; // Increment total subarray count
            }

            // Line break for better readability
            System.out.println();
        }

        // Display total subarray count by loop calculation
        System.out.println("Total SubArrays = " + count);

        // Display total subarray count using formula n*(n+1)/2
        System.out.println("Total SubArrays Using Formula = "
                + ((number.length * (number.length + 1)) / 2));
    }
}
