package Strings.String_In_Out_length_Concat;

import java.util.Scanner;

public class StringInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Single word input
        System.out.print("Enter one word: ");
        String str = sc.next();
        System.out.println("Word entered: " + str);

        // Consume leftover newline
        sc.nextLine();

        // Full line input
        System.out.print("Enter a sentence: ");
        String str1 = sc.nextLine();
        System.out.println("Sentence entered: " + str1);

        sc.close();
    }
}
