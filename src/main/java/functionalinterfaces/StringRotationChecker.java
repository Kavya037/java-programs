package functionalinterfaces;

import java.util.Scanner;

    public class StringRotationChecker {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first string: ");
            String str1 = scanner.nextLine();

            System.out.print("Enter the second string: ");
            String str2 = scanner.nextLine();

            if (isRotation(str1, str2)) {
                System.out.println(str2 + " is a rotation of " + str1);
            } else {
                System.out.println(str2 + " is not a rotation of " + str1);
            }

            scanner.close();
        }

        public static boolean isRotation(String str1, String str2) {
            // Check if both strings are not null and have the same length
            if (str1 == null || str2 == null || str1.length() != str2.length()) {
                return false;
            }

            // Concatenate str1 with itself
            String concatenated = str1 + str1;

            // Check if str2 is a substring of the concatenated string
            return concatenated.contains(str2);
        }
    }

