package L16_String_and_Text_Processing;

import java.util.Scanner;

public class P2_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String controlWord = scanner.nextLine();
        String wordForTesting = scanner.nextLine();

        int controlWordIndex = wordForTesting
                .indexOf(controlWord);

        while (controlWordIndex > -1){
            String firstPart = wordForTesting.substring(0, controlWordIndex);
            String secondPart = wordForTesting.substring(controlWordIndex + controlWord.length());

            wordForTesting = firstPart + secondPart;

            controlWordIndex = wordForTesting.indexOf(controlWord);
        }
        System.out.println(wordForTesting);
    }
}
