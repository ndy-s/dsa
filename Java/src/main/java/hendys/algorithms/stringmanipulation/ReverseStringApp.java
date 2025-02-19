package hendys.algorithms.stringmanipulation;

import java.util.Scanner;

public class ReverseStringApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        scanner.close();

        System.out.println("Reversed: " + reverse(input));
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseManual(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            // Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }
}
