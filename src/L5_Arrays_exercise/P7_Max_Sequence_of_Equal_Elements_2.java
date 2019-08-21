package L5_Arrays_exercise;

import java.util.Scanner;

public class P7_Max_Sequence_of_Equal_Elements_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] textArray = scanner.nextLine().split(" ");
        int[] integerArray = new int[textArray.length];

        for (int i = 0; i < textArray.length; i++) {
            integerArray[i] = Integer.parseInt(textArray[i]);
        }


        int bestElement = 0;
        int counter = 1;
        int bestCounter = 1;
        for (int i = 0; i < integerArray.length - 1; i++) {
            if (integerArray[i] == integerArray[i + 1]){
                counter++;
            }else {
                counter = 1;
            }
            if (counter > bestCounter){
                bestElement = integerArray[i];
                bestCounter = counter;
            }

        }
        for (int i = 0; i < bestCounter; i++) {
            System.out.print(bestElement + " ");
        }

    }
}
