package L3_Data_types_and_variables_exercise;

import java.util.Scanner;

public class P7_Lower_or_Upper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char testedChar = scanner.nextLine().charAt(0);

        if (testedChar >= 65 && testedChar <= 90) {
            System.out.println("upper-case");
        }else {
            System.out.println("lower-case");
        }
    }
}
