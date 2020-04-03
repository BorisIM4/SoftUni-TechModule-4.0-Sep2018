package L11_Associative_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P5_Largest_3_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(number -> System.out.print(number + " "));
    }
}
