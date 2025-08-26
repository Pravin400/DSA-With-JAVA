package Arrays.Day007_ArrayProblem;

import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        Rotate(num,k);
        System.out.println("Rotated Array: " + Arrays.toString(num));

    }

    private static void Rotate(int[] num,int k) {
        int n = num.length;
        k = k % n;

        reverse(num,0,n-1);
        reverse(num,0,k-1);
        reverse(num,k,n-1);



    }
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
