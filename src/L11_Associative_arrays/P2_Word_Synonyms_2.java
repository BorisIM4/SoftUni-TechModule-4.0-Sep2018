package L11_Associative_arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P2_Word_Synonyms_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfKeyWords = Integer.parseInt(scanner.nextLine());

        //Създавам масив със Стрингове и го пълня със всички думи които ни се подават.
        String[] allWords = new String[numberOfKeyWords*2];
        for (int i = 0; i < numberOfKeyWords * 2; i++) {
            String currentWord = scanner.nextLine();

            allWords[i] = currentWord;
        }

        //Пълня Речника с думите от масива. Четните думи са ключ, а нечетните са стойност
        LinkedHashMap<String, String> synonymsMap = new LinkedHashMap<>();

        for (int i = 0; i < numberOfKeyWords; i++) {
            int currentPair = i * 2;
            String wordKey = allWords[currentPair];
            String wordValue = allWords[currentPair+1];


            if (!synonymsMap.containsKey(wordKey)){
                String currentWord = wordValue;
                synonymsMap.put(wordKey, currentWord);
            } else {
                String currentValues = synonymsMap.get(wordKey);
                currentValues = currentValues + ", " + wordValue;
                synonymsMap.put(wordKey,currentValues);
            }

        }

        //Принтираме на резултата
        for (Map.Entry<String, String> currentElementOfTheMap: synonymsMap.entrySet()) {
            System.out.printf("%s - %s" ,currentElementOfTheMap.getKey(), currentElementOfTheMap.getValue());
            System.out.println();
        }


    }
}
