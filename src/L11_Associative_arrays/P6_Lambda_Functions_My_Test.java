package L11_Associative_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P6_Lambda_Functions_My_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        int[] smallerThen70 = Arrays.stream(numbers)
                .filter(x -> x * 2 < 70)
                .toArray();

        System.out.println();

        String[] names = {"Bobi", "Aleks", "Toni"};

        String[] namesShorterThen4Char = Arrays.stream(names)
                .filter(element -> element.length() < 5)
                .map(String::toString)
                .toArray(String[]::new);

        System.out.println();
    }
}
