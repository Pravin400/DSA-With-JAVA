package Strings.String_Problems;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String to Check Palindrome : ");
        String pali = sc.next();
        palindrome(pali);

    }
    public static void palindrome(String pali) {
        int start = 0;
        int end = pali.length()-1;
        boolean palindrome = true;
        for (int i = 0; i <= pali.length()/2 - i-1; i++) {
            if(palindrome == true){

            if(pali.charAt(start)==pali.charAt(end)){
                palindrome = true;
            }
            else {
                palindrome = false;
            }
            }
        }
        if(palindrome==true){
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is not Palindrome");
        }
    }
}
