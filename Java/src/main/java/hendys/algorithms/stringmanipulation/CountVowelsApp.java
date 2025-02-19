package hendys.algorithms.stringmanipulation;

import java.util.Scanner;

public class CountVowelsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        int vowelCount = countVowels(input);

        System.out.println("Number of vowels: " + vowelCount);

        scanner.close();
    }

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }

        return count;
    }
}
