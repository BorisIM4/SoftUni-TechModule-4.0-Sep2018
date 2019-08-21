package L5_Arrays_exercise;

import java.util.Scanner;

public class P8_Magic_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] textArray = scanner.nextLine().split(" ");
        int[] intAray = new int[textArray.length];

        for (int i = 0; i < textArray.length; i++) {
            intAray[i] = Integer.parseInt(textArray[i]);
        }

        int controlNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < intAray.length; i++) {
            for (int j = i + 1; j < intAray.length; j++) {
                int currentSum = intAray[i] + intAray[j];
                if (currentSum == controlNumber){
                    System.out.println(intAray[i] + " " + intAray[j]);
                }
            }
        }
    }
}
