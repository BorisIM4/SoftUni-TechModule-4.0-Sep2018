package L11_Associative_arrays_exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P1_Count_Chars_In_A_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine()
                .replaceAll("\\s+", "");

        Map<Character, Integer> charCounterMap = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            charCounterMap.putIfAbsent(currentChar, 0);
            int currentvalue = charCounterMap.get(currentChar);
            charCounterMap.put(currentChar, currentvalue + 1);
        }

        String pattern = "%c -> %d";
        for (Map.Entry<Character, Integer> kvp : charCounterMap.entrySet()) {
            char key = kvp.getKey();
            int value = kvp.getValue();

            System.out.println(String.format(pattern, key, value));
        }
    }
}