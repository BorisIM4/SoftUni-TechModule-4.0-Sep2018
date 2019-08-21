package L7_Methods_Functions;

import java.util.Scanner;

public class P10_Multiply_Evens_by_Odds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int absNumber = Math.abs(number);

        String numberAsText = Integer.toString(absNumber);

        int result = resultOfMultiplyEvenByOdds(numberAsText);
        System.out.println(result);
    }

    static int resultOfMultiplyEvenByOdds(String number){
        String[] numberAsArray = number.split("");
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < number.length(); i++) {
            int currentDigit = Integer.parseInt(numberAsArray[i]);

            if(currentDigit % 2 == 0){
                evenSum += currentDigit;
            } else {
                oddSum += currentDigit;
            }
        }

        int result = evenSum * oddSum;
        return result;
    }
}
