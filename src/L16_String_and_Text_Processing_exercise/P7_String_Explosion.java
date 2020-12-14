package L16_String_and_Text_Processing_exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P7_String_Explosion {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        System.in));

        String text = reader.readLine();
        String result = "";
        int strenght = 0;

        for (int i = 0; i < text.length(); i++) {

            result += text.charAt(i);

            if (text.charAt(i) == '>') {
                strenght += Integer.parseInt(String.valueOf(
                        text.charAt(i + 1)));
            }

            while (strenght > 0) {
                strenght--;
                i++;

                if (i + 1 >= text.length() || text.charAt(i + 1) == '>') {
                    break;
                }
            }

        }
        System.out.println(result);
    }
}
