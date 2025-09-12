package Divide_And_Conquer.Search_Rotate_Sorted_Array;

public class Sorted_Rotated_Iteration_Code {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0 ;
        int tarIdx = search(arr,target,0,arr.length-1);
        System.out.println("Key found At index : "+tarIdx);

    }
    public static int search(int arr[],int ter,int si,int ei){
        for(int i = si;i<= ei;i++){
            if(arr[i]==ter){
                return i;
            }
        }
        return -1;
    }
}
