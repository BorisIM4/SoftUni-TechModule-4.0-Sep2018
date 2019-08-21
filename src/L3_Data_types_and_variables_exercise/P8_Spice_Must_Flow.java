package L3_Data_types_and_variables_exercise;

import java.util.Scanner;

public class P8_Spice_Must_Flow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstAmountOfSpice = Integer.parseInt(scanner.nextLine());

        int numberOfDays = 0;
        int extractedSpice = 0;
        while (firstAmountOfSpice >= 100){
            numberOfDays++;
            extractedSpice += firstAmountOfSpice;
            extractedSpice -= 26;

            firstAmountOfSpice-=10;
        }
        extractedSpice -= 26;

        System.out.println(numberOfDays);
        System.out.println(extractedSpice);

    }
}
