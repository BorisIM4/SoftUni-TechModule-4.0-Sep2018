package L16_String_and_Text_Processing;

import java.util.Scanner;

public class P1_Repeat_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner
                .nextLine()
                .split("\\s+");

        String resultString = "";
        for (int i = 0; i < input.length; i++) {
            String currentWord = input[i];

            for (int j = 0; j < currentWord.length(); j++) {
                resultString += currentWord;
            }

        }
        System.out.println(resultString);
    }
}
