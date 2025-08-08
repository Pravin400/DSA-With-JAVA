package Arrays.Day003_Arrays;

public class Array_Reverse {
    public static void main(String[] args) {
        int[] sample = {2, 3,5,8,10};
        disp(sample);
        reversearray(sample);
        System.out.println("");
        disp(sample);

    }

    public static void disp(int[] num) {
        for (int no : num) {
            System.out.print(no + " ");
        }
    }

//    public static void reversearray(int[] num) {
//        int start = 0;
//        int end = num.length - 1;
//        for (int i = 0; i < num.length / 2; i++) {
//            int temp = num[start];
//            num[start] = num[end];
//            num[end] = temp;
//            start++;
//            end--;
//        }
//    }

    public static void reversearray(int[] num) {
        int start = 0, end = num.length - 1;
        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }

}
