package L3_Data_types_and_variables;

import java.util.Scanner;

public class P7_Concat_Names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOne = scanner.nextLine();
        String nameTwo = scanner.nextLine();
        String delimiter = scanner.nextLine();

        System.out.println(nameOne + delimiter + nameTwo);

    }
}
