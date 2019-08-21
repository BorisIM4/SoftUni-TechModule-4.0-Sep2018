package L3_Data_types_and_variables_exercise;

import java.util.Scanner;

public class P1_Sum_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String numberToString = number + "";

        int sumOfIntegerInNumber = 0;
        for (int i = 0; i < numberToString.length(); i++) {
            String curremtIntegerAsString = numberToString.charAt(i)+"";
            int currentInteger = Integer.parseInt(curremtIntegerAsString);
            sumOfIntegerInNumber += currentInteger;

        }
        System.out.println(sumOfIntegerInNumber);
    }
}
