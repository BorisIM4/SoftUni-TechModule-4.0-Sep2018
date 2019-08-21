package L7_Methods_Functions_exercise;

import java.util.Scanner;

public class P4_Password_Validator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputPass = scanner.nextLine();

        boolean isItValid = isItValid(inputPass);

        if (isItValid){
            System.out.println("Password is valid");
        }

    }

    public static boolean isItValid(String password){
        boolean isHaveEnoughChars = isHaveEnoughChars(password);
        boolean isHaveLettersAndDigits = isHaveLetterAndDigit(password);
        boolean isHaveAtleastTwoDigit = isHaveAtleastTwoDigit(password);

        if (isHaveEnoughChars && isHaveLettersAndDigits && isHaveAtleastTwoDigit){
            return true;
        }

        return false;
    }

    private static boolean isHaveAtleastTwoDigit(String password) {

        int digitCounter = 0;
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (Character.isDigit(currentChar)){
                digitCounter++;
                if (digitCounter >= 2) {
                    return true;
                }
            }
        }
        System.out.println("Password must have at least 2 digits");
        return false;
    }

    private static boolean isHaveLetterAndDigit(String password) {

        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (!Character.isLetterOrDigit(currentChar)){
                System.out.println("Password must consist only of letters and digits");
                return false;
            }

        }
        return true;
    }

    public static boolean isHaveEnoughChars(String password){
        if (password.length() < 6 || password.length() > 10){
            System.out.println("Password must be between 6 and 10 characters");
            return false;

        }
        return true;
    }


}
