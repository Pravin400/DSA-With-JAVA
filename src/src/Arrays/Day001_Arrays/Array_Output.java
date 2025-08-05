package Arrays.Day001_Arrays;

import java.util.Arrays;

public class Array_Output {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("🔢 Array Elements: Different Output Methods");

        // 1️⃣ Using traditional for loop
        System.out.println("\n1️⃣ Using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // 2️⃣ Using enhanced for-each loop
        System.out.println("\n\n2️⃣ Using for-each loop:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // 3️⃣ Using Arrays.toString() method
        System.out.println("\n\n3️⃣ Using Arrays.toString():");
        System.out.println(Arrays.toString(numbers));

        // 4️⃣ Output one element at a time (manually)
        System.out.println("\n4️⃣ Printing each element separately:");
        System.out.println("Element 1: " + numbers[0]);
        System.out.println("Element 2: " + numbers[1]);
        System.out.println("Element 3: " + numbers[2]);
        System.out.println("Element 4: " + numbers[3]);
        System.out.println("Element 5: " + numbers[4]);

        // 5️⃣ Output using a method
        System.out.println("\n5️⃣ Using a custom method:");
        printArray(numbers);

        //  6️⃣ Length of An Array
        System.out.println("Length of An Array: " + numbers.length);
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
