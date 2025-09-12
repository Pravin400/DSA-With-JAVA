package Divide_And_Conquer.Merge_Sort;

public class Merge_Sort {
    public static void main(String[] args) {

    int[] array = {3,7,2,5,8,1,6,4};
    mergesort(array,0,array.length-1);
    printSortedArray(array);
    }

    public static void printSortedArray(int[] array) {
        for(int i : array) {
            System.out.print(i+" ");
        }
    }

    public static void mergesort(int[] array,int start,int end) {
        if(start>=end){
            return;
        }
        int half = start+(end-start)/2;
        //left side start from start and end at half
        mergesort(array,start,half);
        //right side start from the half+1 till end
        mergesort(array,half+1,end);
        //then merging the sorted
        merge(array,start,half,end);
    }
    public static void merge(int[] array,int start,int half,int end) {
        int temp[] = new int[end-start+1];
        //iterator for left part
        int i = start;
        //iterator for right part
        int j = half+1;
        //iterator for the temp array
        int k = 0;
        while (i <= half && j <= end) {
            if(array[i]<=array[j]){
                temp[k] = array[i];
                i++;
            }else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }
        //remaining left part
        while (i <= half) {
            temp[k++] = array[i++];
        }
        //remaining right part
        while (j <= end) {
            temp[k++] = array[j++];
        }

        //copying the temp array into a original array
        for(k=0,i=start;k<temp.length;k++,i++){
            array[i] = temp[k];
        }
    }
}


