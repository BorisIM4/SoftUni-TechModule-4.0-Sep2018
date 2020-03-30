package L11_Associative_arrays;

import java.util.*;

public class P1_Count_Real_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputNumber = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Map<Integer, Integer> counterRealNumberMap = new TreeMap<>();

        int startNUmber = 1;
        for (int i = 0; i < inputNumber.length; i++) {
            int currnetNUmber = inputNumber[i];

            if (!counterRealNumberMap.containsKey(currnetNUmber)) {
                counterRealNumberMap.put(currnetNUmber, startNUmber);
            } else {
                int currentValue = counterRealNumberMap.get(currnetNUmber);
                currentValue++;
                counterRealNumberMap.put(currnetNUmber, currentValue);
            }
        }

        for (Map.Entry<Integer, Integer> element: counterRealNumberMap.entrySet()) {
            int key = element.getKey();
            int value = element.getValue();

            System.out.printf("%d -> %d" ,key ,value);
            System.out.println();
        }
    }
}
