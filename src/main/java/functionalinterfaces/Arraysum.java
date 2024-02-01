package functionalinterfaces;

import java.util.Scanner;

public class Arraysum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Ask the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Calculate the sum of the array elements
        int sum = 0;
        for (int element : array) {
            sum += element;
        }

        // Print the sum of the array elements
        System.out.println("Sum of the array elements: " + sum);

        scanner.close();
    }
}
