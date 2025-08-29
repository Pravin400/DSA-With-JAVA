package Sorting.InBuiltSort;

import java.util.Arrays;
import java.util.Collections;

public class InBuiltSort {
    public static void main(String[] args) {
        int [] arr = {1,9,7,5,6,2};
        Arrays.sort(arr);
        System.out.println("In Built Sort"+Arrays.toString(arr));
        Integer [] arr1 = {1,9,7,5,6,2};
        //We Use this when we need to sort specific index like form to from
        Arrays.sort(arr1,0,5);//arrayname,startindex,endindex(ending index is non inclusive means if end index is 4 need to write 5 )
        System.out.println("In Built Sort"+Arrays.toString(arr1));
        //to print array in reverse order
        //here uses comparator to sort value
        Arrays.sort(arr1, Collections.reverseOrder());//reverseprder function is work on the Objects
        System.out.println("In Built Sort"+Arrays.toString(arr1));
    }


}
