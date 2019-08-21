package L5_Arrays;

import java.util.Scanner;

public class P7_Condense_Array_to_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] textArray = scanner.nextLine().split(" ");
        int[] integerArray = new int[textArray.length];
        int[] currentArray = new int[integerArray.length-1];

        for (int i = 0; i < textArray.length; i++) {
            integerArray[i] = Integer.parseInt(textArray[i]);
        }

        int integerArraySize = integerArray.length;
        int currentArraySize = currentArray.length;

        int sum = 0;
        int count = 0;

        if (integerArraySize == 1){
            System.out.println(integerArray[0]);
            return;
        }

        while (currentArraySize != 0) {
            for (int i = 0; i < integerArraySize; i++) {
                if (count == integerArraySize - 1) {
                    break;
                }
                currentArray[i] = integerArray[i] + integerArray[i + 1];
                count++;


            }
            for (int i = 0; i < currentArraySize; i++) {
                integerArray[i] = currentArray[i];
            }
            integerArraySize--;
            currentArraySize--;
        }
        System.out.println(currentArray[0]);
    }
}
