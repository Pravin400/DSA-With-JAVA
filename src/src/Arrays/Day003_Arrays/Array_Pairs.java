package Arrays.Day003_Arrays;


public class Array_Pairs {
    public static void main(String[] args) {

    int [] number = {2,3,4,5};

    disp(number);
        System.out.println("\nAll Unique Pairs:");

        pair(number);
    }
    public static void disp(int[] num) {
        for (int no : num) {
            System.out.print(no + " ");
        }
    }
    public static void pair(int [] number){
        int count = 0;
        for(int i = 0;i<number.length;i++){
            for (int j = i+1;j <number.length;j++){
                System.out.print("(" + number[i] + "," + number[j] + ") ");
                count++;

            }

            System.out.println();
        }
        System.out.println("The pairs are: " + count);
    }
}
