package Strings.String_Problems;

import java.util.Scanner;

public class StringPalindrome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check palindrome : ");
        String c = sc.next();
        System.out.println(palindrome(c)+" is this palindrome.");
    }
    public static boolean palindrome(String c){
        for (int i = 0; i <= c.length()/2; i++) {
            int n = c.length();

            if(c.charAt(i)!=c.charAt(n-1-i)){
                return false;
            }
        }

        return true;

    }
}
