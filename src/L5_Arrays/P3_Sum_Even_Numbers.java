package L5_Arrays;

import java.util.Scanner;

public class P3_Sum_Even_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] textArray = scanner.nextLine().split(" ");
        int[] integerArray = new int[textArray.length];

        int sum = 0;

        for (int i = 0; i < textArray.length; i++) {
            integerArray[i] = Integer.parseInt(textArray[i]);
        }

        for (int elements: integerArray) {
            if (elements % 2 ==0) {
                sum += elements;
            }
        }
        System.out.println(sum);
    }
}

