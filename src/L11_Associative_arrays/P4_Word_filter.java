package L11_Associative_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P4_Word_filter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .filter(word -> word.length() % 2 == 0)
                .forEach(System.out::println);

    }
}
