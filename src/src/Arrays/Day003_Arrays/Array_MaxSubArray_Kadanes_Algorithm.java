package Arrays.Day003_Arrays;
/*

 * File: Array_MaxSubArray_Kadanes_Algorithm.java
 *
 * Description:
 * This program implements Kadane's Algorithm to find the maximum subarray sum in O(n) time.
 *
 * Kadane's Algorithm Definition:
 * Kadane's Algorithm is used to find the largest sum of a contiguous subarray
 * within a one-dimensional array of numbers (positive, negative, or zero).
 * */
public class Array_MaxSubArray_Kadanes_Algorithm {

    public static void main(String[] args) {
        // Input array
        int[] number = {-2,-3,4,-1,-2,1,5,-3};
//        int[] number = {-1,-2,-3,-4};


        // Generate prefix sum array
        kadanes(number);

        // Print original array
        System.out.print("Array: { ");
        for (int num : number) {
            System.out.print(num + " ");
        }

    }


    public static void kadanes(int[] number) {
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        int negative = 0;
        for (int j = 0;j<number.length;j++){
            if(number[j]<0){
                negative ++;
            }
            if(negative == number.length){
                for(int i = 0;i<number.length;i++){

                    current_sum = current_sum + number[i];

                    max_sum = Math.max(current_sum,max_sum);
                }
                System.out.println("Our Max SubArray Sum Is : " + max_sum );
                return;
            }
        }
        for(int i = 0;i<number.length;i++){

            current_sum = current_sum + number[i];
            if(current_sum < 0){
                current_sum = 0;
            }
            max_sum = Math.max(current_sum,max_sum);
        }
        System.out.println("Our Max SubArray Sum Is : " + max_sum );
    }
}
