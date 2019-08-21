package L3_Data_types_and_variables;

import java.math.BigDecimal;
import java.util.Scanner;

public class P2_Exact_Sum_of_Real_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfIntegers = Integer.parseInt(scanner.nextLine());

//        BigDecimal sum = new BigDecimal(0);
//
//        BigDecimal one = new BigDecimal(100);
//        BigDecimal two = new BigDecimal(200);
//
//        sum = one.add(two);
//
//        System.out.println(sum);

        BigDecimal sumOfIntegers = new BigDecimal(0);
        for (int i = 0; i < numberOfIntegers; i++) {
            BigDecimal currentNumber = scanner.nextBigDecimal();
            sumOfIntegers = sumOfIntegers.add(currentNumber);
        }

        System.out.println(sumOfIntegers);
    }
}
