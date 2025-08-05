package Arrays.Day001_Arrays;

import java.util.Scanner;

/**
 * Day001 - Array Input
 * Accepts subject marks from user and prints the result
 */
public class Array_Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[4]; // 0: Physics, 1: Chemistry, 2: Biology, 3: Maths

        System.out.println("✅ Array creation successful.\n");

        System.out.println("📥 Enter marks for subjects:");
        System.out.print("Physics   : ");
        marks[0] = sc.nextInt();
        System.out.print("Chemistry : ");
        marks[1] = sc.nextInt();
        System.out.print("Biology   : ");
        marks[2] = sc.nextInt();
        System.out.print("Maths     : ");
        marks[3] = sc.nextInt();

        System.out.println("\n✅ Marks inserted successfully.");
        System.out.println("📝 Entered Marks:");
        System.out.println("Physics   : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Biology   : " + marks[2]);
        System.out.println("Maths     : " + marks[3]);

        int total = marks[0] + marks[1] + marks[2] + marks[3];
        int percentage = total / 4;

        System.out.println("\n📊 Total Marks: " + total + "/400");
        System.out.println("📈 Percentage : " + percentage + "%");
    }
}
