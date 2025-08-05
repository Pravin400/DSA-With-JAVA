package Arrays.Day001_Arrays;

import java.util.Scanner;

public class Array_Day001_Task {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔹 Step 1: Input number of subjects
        System.out.print("📘 Enter the number of subjects: ");
        int n = sc.nextInt();

        // 🔹 Step 2: Declare arrays
        String[] subjects = new String[n];
        int[] marks = new int[n];

        // 🔹 Step 3: Input subject names and marks
        for (int i = 0; i < n; i++) {
            System.out.print("✏️  Enter the name of Subject " + (i + 1) + ": ");
            subjects[i] = sc.next();

            System.out.print("🔢 Enter marks for " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
        }

        // 🔹 Step 4: Display subject-wise marks
        System.out.println("\n📊 Subject-wise Marks:");
        int total = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("• " + subjects[i] + " : " + marks[i]);
            total += marks[i];
        }

        // 🔹 Step 5: Calculate and display total and percentage
        double percentage = (double) total / n;

        System.out.println("\n🧮 Total Marks     : " + total);
        System.out.printf("📈 Percentage      : %.2f%%\n", percentage);

        // 🔹 Optional: Grade based on percentage
        System.out.println("🎓 Grade           : " + getGrade(percentage));
    }

    // 🔸 Function to calculate grade based on percentage
    public static String getGrade(double percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B+";
        else if (percentage >= 60) return "B";
        else if (percentage >= 50) return "C";
        else if (percentage >= 40) return "D";
        else return "F (Fail)";
    }
}
