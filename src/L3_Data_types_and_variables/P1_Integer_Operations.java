package L3_Data_types_and_variables;

import java.util.Scanner;

public class P1_Integer_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInteger = Integer.parseInt(scanner.nextLine());
        int secondInteger = Integer.parseInt(scanner.nextLine());
        int thirdInteger = Integer.parseInt(scanner.nextLine());
        int fourInteger = Integer.parseInt(scanner.nextLine());

        int firstPlusSecondInteger = firstInteger + secondInteger;
        int firstPlusSecondDividedByThird = firstPlusSecondInteger / thirdInteger;
        int resultOfMultiply = firstPlusSecondDividedByThird * fourInteger;

        System.out.println(resultOfMultiply);
    }
}
