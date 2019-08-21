package L1_Basic_syntax;

import java.util.Scanner;

public class P12_Even_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        while (true){
            int number = Integer.parseInt(scanner.nextLine());
            if (number % 2 != 0) {
                System.out.println("Please write an even number.");
            }
            else {
                number =Math.abs(number);
                System.out.printf("The number is: %d" ,number);
                break;
            }
        }
    }
}
