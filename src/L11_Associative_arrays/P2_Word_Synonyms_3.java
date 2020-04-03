package L11_Associative_arrays;

import java.util.*;

public class P2_Word_Synonyms_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfKeyWords = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> synonymsMap = new LinkedHashMap<>();
        for (int i = 0; i < numberOfKeyWords; i++) {
            String key = scanner.nextLine();
            String value = scanner.nextLine();

            synonymsMap.putIfAbsent(key, new ArrayList<>());
            synonymsMap.get(key).add(value);
        }

        String pattern = "%s - %s";
        for (Map.Entry<String, List<String>> keyValuePair : synonymsMap.entrySet()) {
            String key = keyValuePair.getKey();
            String value = String.join(", ", keyValuePair.getValue());

            System.out.println(String.format(pattern, key, value));
        }
    }
}