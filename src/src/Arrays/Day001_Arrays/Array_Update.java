package Arrays.Day001_Arrays;

import java.util.Scanner;

/**
 * Day001 - Array Update
 * Accepts marks, allows user to update them, and prints updated result
 */
public class Array_Update {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[4]; // Physics, Chemistry, Biology, Maths

        // Initial Input
        System.out.println("📥 Enter initial marks:");
        enterMarks(sc, marks);

        System.out.println("\n✅ Initial marks entered.");
        displayMarks(marks);

        // Update
        System.out.println("\n🛠️ Update Marks:");
        enterMarks(sc, marks);

        System.out.println("\n✅ Marks updated successfully.");
        displayMarks(marks);

        // Percentage
        int total = marks[0] + marks[1] + marks[2] + marks[3];
        int percentage = total / 4;

        System.out.println("\n📊 Total Marks: " + total + "/400");
        System.out.println("📈 Percentage : " + percentage + "%");

    }

    public static void enterMarks(Scanner sc, int[] marks) {
        System.out.print("Physics   : ");
        marks[0] = sc.nextInt();
        System.out.print("Chemistry : ");
        marks[1] = sc.nextInt();
        System.out.print("Biology   : ");
        marks[2] = sc.nextInt();
        System.out.print("Maths     : ");
        marks[3] = sc.nextInt();
    }

    public static void displayMarks(int[] marks) {
        System.out.println("📝 Current Marks:");
        System.out.println("Physics   : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Biology   : " + marks[2]);
        System.out.println("Maths     : " + marks[3]);
    }

}
