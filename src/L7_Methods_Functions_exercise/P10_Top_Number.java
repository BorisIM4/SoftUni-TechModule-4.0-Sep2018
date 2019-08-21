package L7_Methods_Functions_exercise;

import java.util.Scanner;

public class P10_Top_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            if (isItTopNumber(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isItTopNumber(int number){
        boolean isItDivisibleByEight = isItDivisibleByEight(number);
        boolean isConteintOdd = isConteinsOdd(number);

        if (isItDivisibleByEight && isConteintOdd){
            return true;
        }
        return false;
    }

    private static boolean isConteinsOdd(int number) {
        String numberAsString = number + "";
        for (int i = 0; i < numberAsString.length(); i++) {
            char currentDigitAsChar = numberAsString.charAt(i);
            int currnetDigitAsInt = (int) currentDigitAsChar;
            if (currnetDigitAsInt % 2 != 0){
                return true;
            }
        }
        return false;

    }

    private static boolean isItDivisibleByEight(int number) {
        String numberAsString = number + "";
        int sumOfDigit = 0;
        for (int i = 0; i < numberAsString.length(); i++) {
            char currentDigitAsChar = numberAsString.charAt(i);
            int currnetDigitAsInt = (int) currentDigitAsChar;
            sumOfDigit += currnetDigitAsInt;
        }
        if (sumOfDigit % 8 == 0){
            return true;
        }
        return false;
    }

}
