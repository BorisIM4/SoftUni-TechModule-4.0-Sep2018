package L5_Arrays_exercise;

import java.util.Scanner;

public class P3_Zig_Zag_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfRows = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[numberOfRows];
        int[] secondArray = new int[numberOfRows];

        for (int i = 0; i < numberOfRows; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                firstArray[i] = Integer.parseInt(input[0]);
                secondArray[i] = Integer.parseInt(input[1]);
            }else {
                firstArray[i] = Integer.parseInt(input[1]);
                secondArray[i] = Integer.parseInt(input[0]);
            }
        }
        for (int integer :firstArray) {
            System.out.print(integer + " ");
        }
        System.out.println();
        for (int integer:secondArray) {
            System.out.print(integer + " ");
        }
    }
}
