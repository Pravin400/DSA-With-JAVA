package Arrays.Day002_Arrays;

public class Array_Linear_Search_SmallestNumber {
    public static void main(String[] args) {
//        int [] numbers = {};
        int [] numbers = {4,5,6,11,7,55,2,1};
        int key = 2;
        Smallest1(numbers);
        Smallest2(numbers);

    }
//    this  mehtod fail when our arrya is empty
    public static void Smallest1(int [] numbers){
        int min = numbers[0];
        for(int min1 : numbers){
            if(min1 < min){
                min = min1;
            }
        }            System.out.println("the maximum number is : "+ min);

    }
    public static void Smallest2(int [] numbers){
        int max = Integer.MAX_VALUE;
        for(int min2 : numbers){
            if(min2 < max){
                max = min2;
            }
        }            System.out.println("the maximum number is : "+max);

    }
}
