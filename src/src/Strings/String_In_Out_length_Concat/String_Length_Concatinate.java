package Strings.String_In_Out_length_Concat;

import java.util.Scanner;

public class String_Length_Concatinate {

    public static void main(String[] args) {
    String fullname = "Tony Stark";

        System.out.println("Full Name: " + fullname);
        System.out.print("Length of full name is : ");
        System.out.println(fullname.length());//during counting length space also counted
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First Name : ");
        String firstName = sc.next();
        System.out.print("Enter a Last Name : ");
        String lastName = sc.next();
        System.out.print("Length of full name is : ");

        System.out.println(firstName.concat(" "+lastName));
        System.out.println(firstName+" "+lastName);

    }
}