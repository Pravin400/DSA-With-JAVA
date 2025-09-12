package Divide_And_Conquer.Quick_Sort;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        quicksort(arr,0,arr.length-1);
        printSortedArray(arr);
    }

    public static void printSortedArray(int[] array) {
        for(int i : array) {
            System.out.print(i+" ");
        }
    }

    public static void quicksort(int arr[],int si,int ei){
        if(si >= ei){
            return;
        }
        //pivot consider as a last element
        int pIdx = partition(arr,si,ei);//pivot can make middle man take smaller element in front and greater element in back

        quicksort(arr,si,pIdx-1);//for left part
        quicksort(arr,pIdx+1,ei);//for right part
    }

    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;//to make place for elements those smaller, then pivot

        for(int j = si;j < ei;j++){
            if(arr[j]<pivot){
                i++;
//                swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;
        return i;
    }
}
