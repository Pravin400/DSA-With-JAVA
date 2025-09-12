package Divide_And_Conquer.Search_Rotate_Sorted_Array;

public class Sorted_Rotated_Code {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0 ;
        int tarIdx = search(arr,target,0,arr.length-1);
        System.out.println("Key found At index : "+tarIdx);

    }
    public static int search(int arr[],int ter,int si,int ei){
        if(si >ei){
            return -1;
        }
        int mid  = si + (ei - si)/2;

        if(arr[mid]==ter){
            return mid;
        }

        //mid lies on l1
        if(arr[si] <=arr[mid]){
            //case a key is at left side
            if(arr[si] <= ter && arr[mid] >= ter ){
                return search(arr,ter,si,mid-1);
            }else {
//                case b key is at right side
                return search(arr,ter,mid+1,ei);
            }
        }

        //mid lies on l2
        else {
            //case c key is at right side
            if(arr[mid]<=ter && arr[si] >= ter ){
                return search(arr,ter,mid+1,ei);
            }

            //case c key is at left side

            else {
                return search(arr,ter,si,mid-1);
            }

        }
    }
}
