package L3_Data_types_and_variables_exercise;

import java.util.Scanner;

public class P2_Chars_to_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.next().charAt(0);
        char secondChar = scanner.next().charAt(0);
        char thirdChar = scanner.next().charAt(0);

        String firstCharAsString = firstChar + "";
        String secondCharAsString = secondChar + "";
        String thirdCharAsString = thirdChar + "";

        System.out.println(firstCharAsString + secondCharAsString + thirdCharAsString);

    }
}
