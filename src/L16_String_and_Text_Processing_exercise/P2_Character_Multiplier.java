package L16_String_and_Text_Processing_exercise;

import java.util.Scanner;

public class P2_Character_Multiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());

        String firstWord = text.substring(0, text.indexOf(" "));
        String secondWord = text.substring(text.lastIndexOf(" ") + 1);

        System.out.println(multiplier(firstWord, secondWord));


    }

    private static long multiplier(String firstWord, String secondWord) {
        int minLength = Math.min(firstWord.length(), secondWord.length());
        long result = 0;
        for (int i = 0; i < minLength; i++) {
            result += firstWord.charAt(i) * secondWord.charAt(i);
        }

        if (firstWord.length() > secondWord.length()){
            int residue = firstWord.length() - secondWord.length();
            for (int i = secondWord.length(); i < firstWord.length(); i++) {
                result += firstWord.charAt(i);
            }
        } else {
            int residue = secondWord.length() - firstWord.length();
            for (int i = firstWord.length(); i < secondWord.length(); i++) {
                result += secondWord.charAt(i);
            }
        }

        return result;
    }
}
