package L5_Arrays_exercise;

import java.util.Scanner;

public class P6_Equal_Sums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] textArray = scanner.nextLine().split(" ");
        int[] intArray = new int[textArray.length];

        for (int i = 0; i < textArray.length; i++) {
            intArray[i] = Integer.parseInt(textArray[i]);
        }

        boolean testFlag = false;

        for (int i = 0; i < intArray.length; i++) {
            int sumLeftSide = 0;
            int sumRightSide = 0;

            for (int j = i - 1; j >= 0; j--) {
                sumLeftSide += intArray[j];
            }
            for (int j = i + 1; j < intArray.length; j++) {
                sumRightSide += intArray[j];
            }

            if (sumLeftSide == sumRightSide) {
                System.out.println(i);
                testFlag = true;
                break;
            }
        }
        if (!testFlag){
            System.out.println("no");
        }
    }
}
