package L11_Associative_arrays;

import java.util.*;
import java.util.stream.Collectors;

public class P3_Odd_Occurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String lowerCaseInput = input.toLowerCase();

        String[] allWordsAsArray = lowerCaseInput.split(" ");

        Map<String, Integer> elementMap = new LinkedHashMap<>();

        int startNumber = 1;
        for (int i = 0; i < allWordsAsArray.length; i++) {
            String currentWord = allWordsAsArray[i];

            if(!elementMap.containsKey(currentWord)){
                elementMap.put(currentWord, startNumber);
            } else {
                int currentValue = elementMap.get(currentWord);
                currentValue++;
                elementMap.put(currentWord, currentValue);
            }
        }

        String wordsForPrint = "";
        for (Map.Entry<String, Integer> currentPair : elementMap.entrySet()) {
            String currentKey = currentPair.getKey();
            int currentValue = currentPair.getValue();

                if (currentValue % 2 != 0){
                    wordsForPrint = wordsForPrint + " " + currentKey;
                }
        }

        System.out.println(String.format(wordsForPrint.replaceAll(" ", ", ")).substring(2));

    }
}
