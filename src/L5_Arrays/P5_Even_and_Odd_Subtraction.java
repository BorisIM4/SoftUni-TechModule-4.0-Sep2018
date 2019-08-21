package L5_Arrays;

import java.util.Scanner;

public class P5_Even_and_Odd_Subtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] textArray = scanner.nextLine().split(" ");
        int[] integersArray = new int[textArray.length];

        int sumOfEven = 0;
        int sumOfOdd = 0;

        int differential = 0;


        for (int i = 0; i < textArray.length; i++) {
            integersArray[i] = Integer.parseInt(textArray[i]);
        }
        for (int elements:integersArray) {
            if (elements % 2 == 0) {
                sumOfEven += elements;
            }else {
                sumOfOdd +=elements;
            }

        }

        differential = sumOfEven - sumOfOdd;
        System.out.println(differential);
    }
}
