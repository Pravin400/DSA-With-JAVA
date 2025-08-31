package _2D_Arrays;

import java.util.Scanner;

public class _2D_Array_Creation {
    public static void main(String[] args) {
        //for 2d array creation need to write this
        int [] [] matrix  = new int [3] [3];//and here 3✖️3 = 9 matrix will be created means total 9 cells (have 9 spaces to store the value/element)
        Scanner input = new Scanner(System.in);
        //in any array we store the element in a row wise manner
        int rows = matrix.length;
        int cols = matrix[0].length;
        System.out.print("Enter the number of rows and columns you want to enter : ");
        for(int i=0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                matrix[i][j]=input.nextInt();
            }
        }
        //output

        System.out.println(
                "The matrix are : "
        );

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("enter the element you want to find : ");
        int key = input.nextInt();
        search(matrix,key);
        
          
    }
    
    public static boolean search(int [][] matrix,int key) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i=0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(key==matrix[i][j]){
                    System.out.print(matrix[i][j]+" key found at index ( "+i+","+j+")\n");
                    return true;
                }
            }
        }
        return false;
    }
}
