package L3_Data_types_and_variables_exercise;

import java.util.Scanner;

public class P5_Pounds_to_Dollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int cuantityOfPounds = Integer.parseInt(scanner.nextLine());

        double valueOfDollarForOnePounds = 1.31;

        double cuantityOfDollars = cuantityOfPounds * valueOfDollarForOnePounds;

        System.out.printf("%.3f" ,cuantityOfDollars);
    }
}
