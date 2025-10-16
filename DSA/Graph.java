// 
import java.util.Scanner;

public class Graph {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();

        // Outer loop for each row
        for (int i = 0; i < numRows; i++) {
            // Print leading spaces for proper alignment
            for (int j = 0; j < numRows - i - 1; j++) {
                System.out.print(" ");
            }

            int coefficient = 1; // First element of each row is 1
            // Inner loop for elements in each row
            for (int j = 0; j <= i; j++) {
                System.out.print(coefficient + " ");
                coefficient = coefficient * (i - j) / (j + 1); // Calculate next coefficient
            }
            System.out.println(); // Move to the next line after printing a row
        }
        scanner.close();
    }
}