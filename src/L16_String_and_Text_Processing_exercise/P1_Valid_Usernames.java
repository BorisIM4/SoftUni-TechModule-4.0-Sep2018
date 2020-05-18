package L16_String_and_Text_Processing_exercise;

import java.util.Scanner;

public class P1_Valid_Usernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (String word : input) {
            if (isItValid(word)) {
                System.out.println(word);
            }
        }


    }

    public static boolean isItValid(String word) {
        if (word.length() < 3 || word.length() > 16) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (!Character.isLetterOrDigit(currentChar) && word.charAt(i) != '-' && word.charAt(i) != '_') {
               return false;
            }
        }

        return true;
    }
}
