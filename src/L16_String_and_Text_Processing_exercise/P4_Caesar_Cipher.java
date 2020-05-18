package L16_String_and_Text_Processing_exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4_Caesar_Cipher {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        String text = reader.readLine();

        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            int newCharIndex = currentChar + 3;

            char newChar = (char) newCharIndex;

            encryptedText.append(newChar);
        }

        System.out.println(encryptedText);
    }
}
