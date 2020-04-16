package L16_String_and_Text_Processing;

import java.util.Scanner;

public class P4_Text_Filter_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banWordsArray = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < banWordsArray.length; i++) {
            String currentBanWord = banWordsArray[i];
            String replacementWord = repeatStringer("*", currentBanWord.length());

            text = text.replaceAll(currentBanWord,replacementWord);
        }
        System.out.println(text);
    }

    public static String repeatStringer (String str, int count){
        String output = "";
        for (int i = 0; i < count; i++) {
            output += str;
        }
        return output;
    }
}
