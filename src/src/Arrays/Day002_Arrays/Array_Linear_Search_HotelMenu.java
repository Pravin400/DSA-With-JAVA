package Arrays.Day002_Arrays;

import java.util.Objects;
import java.util.Scanner;

public class Array_Linear_Search_HotelMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Hotel menu items
        String[] menu = {"Dosa", "Chole", "Samosa", "Misal", "Tea"};

        System.out.println("🍽️ Welcome to the Java Hotel!");
        System.out.println("------------------------------");
        System.out.println("Today's Menu:");
        display(menu);
        System.out.println("------------------------------");

        // Take user input
        System.out.print("🔍 What would you like to search for? ");
        String userInput = sc.next();

        // Perform linear search
        int result = hotelMenuSearch(menu, userInput);

        // Display search result
        if (result != -1) {
            System.out.println("✅ " + menu[result] + " is available at index: " + result);
        } else {
            System.out.println("❌ Sorry, " + userInput + " is not on the menu today.");
        }

        sc.close();
    }

    // Linear search method
    public static int hotelMenuSearch(String[] menu, String input) {
        for (int i = 0; i < menu.length; i++) {
            if (Objects.equals(input.toLowerCase(), menu[i].toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

    // Method to display the menu
    public static void display(String[] menu) {
        for (String item : menu) {
            System.out.println("• " + item);
        }
    }
}
