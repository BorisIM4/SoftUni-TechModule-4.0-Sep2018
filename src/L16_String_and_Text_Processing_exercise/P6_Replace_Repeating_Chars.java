package L16_String_and_Text_Processing_exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P6_Replace_Repeating_Chars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();

        StringBuilder finalWord = new StringBuilder();
        for (int i = 0; i < text.length() - 1; i++) {
            char currentCharOne = text.charAt(i);
            char currentCharTwo = text.charAt(i + 1);

        }
    }
}
