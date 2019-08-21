package L5_Arrays_exercise;

import java.util.Scanner;

public class P3_Zig_Zag_Arrays_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthOfArray = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[lengthOfArray];
        int[] secondArray = new int[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++) {
            String text = scanner.nextLine();
            String[] textArray = text.split(" ");
            int[] textArrayToIntArray = new int[textArray.length];

            for (int j = 0; j < textArray.length; j++) {
                textArrayToIntArray[j] = Integer.parseInt(textArray[j]);
            }

            if (i % 2 == 0){
                firstArray[i] = textArrayToIntArray[0];
                secondArray[i] = textArrayToIntArray[1];
            } else {
                firstArray[i] = textArrayToIntArray[1];
                secondArray[i] = textArrayToIntArray[0];
            }
        }

        for (int element:firstArray) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int element:secondArray) {
            System.out.print(element + " ");
        }
    }
}