package L1_Basic_syntax;

import java.util.Scanner;

public class P11_Multiplication_Table_2_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int multiplicationNumber = Integer.parseInt(scanner.nextLine());


        if (multiplicationNumber > 10) {
            int result = number * multiplicationNumber;
            System.out.printf("%d X %d = %d%n" ,number ,multiplicationNumber ,result);
        }
        else {
            for (int i = multiplicationNumber; i <= 10; i++) {
                int result = number * i;
                System.out.printf("%d X %d = %d%n" ,number ,i ,result);
            }
        }

    }
}
