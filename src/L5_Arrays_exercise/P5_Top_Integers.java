package L5_Arrays_exercise;

import java.util.Scanner;

public class P5_Top_Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] textArray = scanner.nextLine().split(" ");
        int[] intArray = new int[textArray.length];

        for (int i = 0; i < textArray.length; i++) {
            intArray[i] = Integer.parseInt(textArray[i]);
        }

        boolean testFlag = false;

        for (int i = 0; i < intArray.length - 1; i++) {
            int testedElement = intArray[i];
            for (int j = i + 1; j < intArray.length; j++) {

                if (testedElement <= intArray[j]){
                    testFlag = false;
                    break;
                }else {
                    testFlag = true;
                }

            }

            if (testFlag){
                System.out.print(testedElement + " ");
            }

        }

        System.out.print(intArray[intArray.length-1]);

    }
}
