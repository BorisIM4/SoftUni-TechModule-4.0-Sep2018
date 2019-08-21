package L1_Basic_syntax;

import java.util.Scanner;

public class P9_Sum_of_Odd_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int count = 0;

        for (int i = 1; count < number; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
                count ++;

            }

        }
        System.out.printf("Sum: %d",sum);
    }
}
