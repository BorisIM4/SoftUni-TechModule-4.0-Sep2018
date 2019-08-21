package L11_Associative_arrays;

import java.util.*;

public class P1_Count_Real_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputNumber = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Map<Integer, Integer> counter = new TreeMap<>();

        int counter2 = 1;
        for (int i = 0; i < counter.size(); i++) {
            int currentElement = inputNumber[i];
            int tet = 10;
            counter.put(currentElement, tet);
        }

        System.out.println();
    }
}
