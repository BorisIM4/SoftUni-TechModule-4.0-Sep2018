package L7_Methods_Functions;

import java.util.Scanner;

public class P8_Math_Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double baseValue = Double.parseDouble(scanner.nextLine());
        int powerValue = Integer.parseInt(scanner.nextLine());

        double powerResult = calculatePowerOfSomenumber(baseValue, powerValue);
        System.out.printf("%.0f",powerResult);
    }

    static double calculatePowerOfSomenumber(double baseNumber, int powerNumber){
        double result = baseNumber;

        for (int i = 0; i < powerNumber - 1; i++) {
            result *= baseNumber;
        }

        return result;
    }
}
