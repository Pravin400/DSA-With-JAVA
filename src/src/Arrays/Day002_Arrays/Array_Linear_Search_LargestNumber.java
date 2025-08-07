package Arrays.Day002_Arrays;

public class Array_Linear_Search_LargestNumber {
    public static void main(String[] args) {
//        int [] numbers = {};
        int [] numbers = {4,5,6,11,7,55,2,1};
        int key = 2;
        largest1(numbers);
        largest2(numbers);

    }
//    this  mehtod fail when our arrya is empty
    public static void largest1(int [] numbers){
        int max = numbers[0];
        for(int max1 : numbers){
            if(max1 > max){
                max = max1;
            }
        }            System.out.println("the maximum number is : "+max);

    }
    public static void largest2(int [] numbers){
        int max = Integer.MIN_VALUE;
        for(int max1 : numbers){
            if(max1 > max){
                max = max1;
            }
        }            System.out.println("the maximum number is : "+max);

    }
}
