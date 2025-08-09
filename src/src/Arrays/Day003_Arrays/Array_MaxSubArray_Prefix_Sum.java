package Arrays.Day003_Arrays;

public class Array_MaxSubArray_Prefix_Sum {

    public static void main(String[] args) {
        // Input array
        int[] number = {2, 4, 6, 8, 10};

        // Build prefix sum array
        int[] prefixSum = buildPrefixSum(number);

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

        // Example: Get sum of subarray [1..3]
        int l = 1, r = 3;
        int subarraySum = getSubarraySum(prefixSum, l, r);
        System.out.println("Sum of subarray from index " + l + " to " + r + " = " + subarraySum);
    }

    /**
     * Builds the prefix sum array.
     * prefixSum[i] = number[0] + number[1] + ... + number[i]
     *
     * @param number input array
     * @return prefix sum array
     */
    public static int[] buildPrefixSum(int[] number) {
        if (number == null || number.length == 0) {
            return new int[0]; // return empty array if input is invalid
        }

        int[] prefixSum = new int[number.length];
        prefixSum[0] = number[0]; // first element is same as original

        for (int i = 1; i < number.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + number[i];
        }
        return prefixSum;
    }

    /**
     * Returns sum of elements from index l to r (inclusive) in O(1) time.
     *
     * @param prefixSum prefix sum array
     * @param l starting index
     * @param r ending index
     * @return sum of subarray [l..r]
     */
    public static int getSubarraySum(int[] prefixSum, int l, int r) {
        if (l == 0) {
            return prefixSum[r];
        }
        return prefixSum[r] - prefixSum[l - 1];
    }
}
