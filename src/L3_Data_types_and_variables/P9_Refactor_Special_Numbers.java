package L3_Data_types_and_variables;

import java.util.Scanner;

public class P9_Refactor_Special_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfIntegers = Integer.parseInt(scanner.nextLine());
        int obshto = 0;
        int takova = 0;
        boolean toe = false;
        for (int i = 1; i <= numberOfIntegers; i++) {
            takova = i;
            while (i > 0) {
                obshto += i % 10;
                i = i / 10;
            }
            toe = (obshto == 5) || (obshto == 7) || (obshto == 11);
            System.out.printf("%d -> %b%n", takova, toe);
            obshto = 0;
            i = takova;
        }

    }
}
