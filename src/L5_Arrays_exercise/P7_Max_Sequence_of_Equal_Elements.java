package L5_Arrays_exercise;

import java.util.Scanner;

public class P7_Max_Sequence_of_Equal_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] textArray = scanner.nextLine().split(" ");
        int[] intArray = new int[textArray.length];

        for (int i = 0; i < textArray.length; i++) {
            intArray[i] = Integer.parseInt(textArray[i]);
        }

        int counter = 1;
        int maxLength = 1;
        int bestindex = 0;

        for (int i = 0; i < intArray.length - 1; i++) {
            if (intArray[i] == intArray[i+1]){
                counter++;
            }else {
                counter = 1;
            }

            if(counter > maxLength){
                maxLength = counter;
                bestindex = i + 1;
            }
        }
        int begin = (bestindex - maxLength) + 1;

        for (int i = begin; i <begin + maxLength; i++) {
            System.out.print(intArray[i] + " ");
        }

    }
}
