package L11_Associative_arrays;

import java.util.*;

public class P2_Word_Synonyms {
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
        Map<String, List<String>> synonymsMap = new LinkedHashMap<>();

        for (int i = 0; i < numberOfKeyWords; i++) {
            int currentPair = i * 2;
            String wordKey = allWords[currentPair];
            String wordValue = allWords[currentPair+1];


            if (!synonymsMap.containsKey(wordKey)){
                ArrayList<String> currentWord = new ArrayList<>();
                currentWord.add(wordValue);
                synonymsMap.put(wordKey, currentWord);
            } else {
                List<String> currentValues = synonymsMap.get(wordKey);
                currentValues.add(wordValue);
                synonymsMap.put(wordKey,currentValues);
            }

        }

        //Принтираме на екрана
        String pattern = "%s - %s";
        for(Map.Entry<String, List<String>> kvp : synonymsMap.entrySet()){
            String key = kvp.getKey();
            String value = String.join(", ", kvp.getValue());

            System.out.println(String.format(pattern, key, value));
        }
    }
}
