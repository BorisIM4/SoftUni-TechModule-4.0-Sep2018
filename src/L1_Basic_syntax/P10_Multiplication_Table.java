package L1_Basic_syntax;

import java.util.Scanner;

public class P10_Multiplication_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= 10; i++) {
            int multiplication = i * number;

            System.out.printf("%d X %d = %d%n" ,number ,i ,multiplication);


        }
    }
}
