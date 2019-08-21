package L3_Data_types_and_variables;

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class P5_Special_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            int digitSum = 0;
            String currentNumber = i + "";

            for (int j = 0; j < currentNumber.length(); j++) {
                digitSum += Integer.parseInt(currentNumber.charAt(j) + "");
            }

            boolean isItFive = digitSum == 5;
            boolean isItSeven = digitSum == 7;
            boolean isItEleven = digitSum == 11;

            boolean isItSpecial = isItFive || isItSeven || isItEleven;

            String isIsSpecialAsStrring = isItSpecial + "";
            String isItSpecialAsStringFirstChar = isIsSpecialAsStrring.charAt(0)+"";
            String isItSpecialAsStringFirstCharToUpper = isItSpecialAsStringFirstChar.toUpperCase();
            String isItSpecialAsStringLastPart = isIsSpecialAsStrring.substring(1);

            String finalSpecial = isItSpecialAsStringFirstCharToUpper + isItSpecialAsStringLastPart;

            System.out.println(i + " -> " + finalSpecial);

        }
    }
}
