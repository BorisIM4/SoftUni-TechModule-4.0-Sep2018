package L7_Methods_Functions_exercise;

import java.util.Scanner;

public class P8_Factorial_Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long firstNumber = Long.parseLong(scanner.nextLine());
        long secondNumber = Long.parseLong(scanner.nextLine());

        double divideresult = factoriel(firstNumber) / factoriel(secondNumber);

        System.out.printf("%.2f",divideresult);
    }

    public static double factoriel(long number){
        long current = 1;
        for (int i = 1; i <= number; i++) {
            current *= i;
        }

        return current;
    }
}
