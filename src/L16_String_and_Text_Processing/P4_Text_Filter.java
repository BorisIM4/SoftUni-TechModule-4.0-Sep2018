package L16_String_and_Text_Processing;

import java.util.Scanner;

public class P4_Text_Filter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banWordsArray = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < banWordsArray.length; i++) {
            String currentBanWord = banWordsArray[i];
            String replacementWord = "*".repeat(currentBanWord.length());

            text = text.replaceAll(currentBanWord,replacementWord);
        }
        System.out.println(text);
    }
}
