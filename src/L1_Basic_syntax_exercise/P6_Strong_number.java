package L1_Basic_syntax_exercise;

import java.util.Scanner;

public class P6_Strong_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());

        int testNumber = inputNumber;

        int sum = 0;

        while (testNumber > 0){
            int digit = testNumber % 10;
            testNumber /= 10;

            int factoriel = 1;

            for (int i = 1; i <= digit; i++) {
                factoriel *= i;

            }
            sum += factoriel;

        }

        if (sum == inputNumber) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
