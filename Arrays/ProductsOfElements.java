import java.util.Scanner;   // Imports the Scanner class to take input from the user.

public class ProductOfElements {   // Defines the class named ProductOfElements.

    public static void main(String[] args) {   // Main method where the program starts.

        Scanner sc = new Scanner(System.in);   // Creates a Scanner object to read keyboard input.

        // Ask the user to enter the number of elements in the array.
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();   // Reads the size of the array.

        // Create an integer array of size n.
        int[] arr = new int[n];

        // Ask the user to enter the array elements.
        System.out.println("Enter the elements:");

        // Loop to store each element into the array.
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();   // Reads an integer and stores it in the array.
        }

        // Initialize the product variable with 1.
        // We use 1 because multiplying by 1 does not change the value.
        long product = 1;

        // Loop through the array and multiply each element.
        for (int i = 0; i < n; i++) {
            product *= arr[i];   // Same as: product = product * arr[i];
        }

        // Display the final product of all array elements.
        System.out.println("Product of elements = " + product);

        // Close the Scanner object to free system resources.
        sc.close();
    }
}