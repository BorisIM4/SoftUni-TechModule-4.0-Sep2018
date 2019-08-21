package L7_Methods_Functions_exercise;

import java.util.Scanner;

public class P9_Palindrome_Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")){
            String newInput = new StringBuilder(input).reverse().toString();

            boolean isitPali = isItPalindrome(input, newInput);

            System.out.println(isitPali);

            input = scanner.nextLine();
        }
    }

    public static boolean isItPalindrome(String one, String two){
        if (one.equals(two)){
            return true;
        }else {
            return false;
        }
    }
}
