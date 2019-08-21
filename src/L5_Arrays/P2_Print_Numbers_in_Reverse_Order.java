package L5_Arrays;

import java.util.Scanner;

public class P2_Print_Numbers_in_Reverse_Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfIntegers = Integer.parseInt(scanner.nextLine());

        int[] arrayOfIntegers = new int [numberOfIntegers];

        for (int i = 0; i < arrayOfIntegers.length; i++) {
            int currentInteger = Integer.parseInt(scanner.nextLine());

            arrayOfIntegers[i] = currentInteger;
        }

        for (int i = arrayOfIntegers.length - 1; i >= 0; i--) {
            System.out.print(arrayOfIntegers[i] + " ");
        }
        System.out.println();
    }
}
