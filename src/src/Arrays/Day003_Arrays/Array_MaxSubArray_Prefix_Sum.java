package Arrays.Day003_Arrays;

public class Array_MaxSubArray_Prefix_Sum {

    public static void main(String[] args) {
        // Input array
        int[] number = {2, 4, 6, 8, 10};

        // Array to store prefix sums
        int[] prefixSum = new int[number.length];

        // Generate prefix sum array
        buildPrefixSum(number, prefixSum);

        // Print original array
        System.out.print("Array: { ");
        for (int num : number) {
            System.out.print(num + " ");
        }
        System.out.println("}");

        // Print prefix sum array
        System.out.print("Prefix Sum Array: { ");
        for (int sum : prefixSum) {
            System.out.print(sum + " ");
        }
        System.out.println("}");
    }

    /**
     * Builds the prefix sum array for the given number array.
     * prefixSum[i] = number[0] + number[1] + ... + number[i]
     *
     * @param number     input array
     * @param prefixSum  array to store prefix sums
     */
    public static void buildPrefixSum(int[] number, int[] prefixSum) {
        prefixSum[0] = number[0]; // First element is same as original

        for (int i = 1; i < number.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + number[i];
        }
    }
}
