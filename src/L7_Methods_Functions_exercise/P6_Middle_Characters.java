package L7_Methods_Functions_exercise;

import java.util.Scanner;

public class P6_Middle_Characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputedText = scanner.nextLine();


        String middleChar = middleCharsOfString(inputedText);

        printMiddleString(middleChar);
    }

    public static void printMiddleString(String someText) {
        System.out.println(someText);
    }
    private static String middleCharsOfString(String inputedText) {
        if (inputedText.length() % 2 != 0){
            int numberOfIndex = (inputedText.length() / 2);
            char middleChar = inputedText.charAt(numberOfIndex);
            String middleString = middleChar + "";
            return middleString;
        }else {
            int numberOfFirstIndex = (inputedText.length() / 2);
            char chartofFirstIndex = inputedText.charAt(numberOfFirstIndex - 1);
            int numberOfSecondIndex = numberOfFirstIndex + 1;
            char charOfSecondIndex = inputedText.charAt(numberOfSecondIndex - 1);
            String middleString = chartofFirstIndex + "" + charOfSecondIndex;
            return middleString;
        }
    }
}
