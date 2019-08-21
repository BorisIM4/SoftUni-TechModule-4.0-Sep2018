package L5_Arrays_exercise;

import java.util.Scanner;

public class P4_Array_Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] textArray = scanner.nextLine().split(" ");
        int[] integerArray = new int[textArray.length];

        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = Integer.parseInt(textArray[i]);
        }

        int[] secondArray = new int[integerArray.length];

        int possition = Integer.parseInt(scanner.nextLine());

        for (int j = 0; j < possition; j++) {
            for (int i = 0; i < secondArray.length - 1; i++) {
                int holdingElement = integerArray[0];
                secondArray[i] = integerArray[i + 1];
                secondArray[integerArray.length - 1] = holdingElement;
            }

            for (int i = 0; i < secondArray.length; i++) {
                integerArray[i] = secondArray[i];
            }
        }


        for (int element:integerArray) {
            System.out.print(element + " ");
        }
    }
}
