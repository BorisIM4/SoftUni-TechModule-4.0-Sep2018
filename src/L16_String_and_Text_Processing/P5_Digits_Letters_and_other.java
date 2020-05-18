package L16_String_and_Text_Processing;

import java.util.Scanner;

public class P5_Digits_Letters_and_other {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String digitString = isItDigit(text);
        System.out.println(digitString);
        String letterString = isItLetter(text);
        System.out.println(letterString);
        String specialSymbolString = isItsoecialSymbol(text);
        System.out.println(specialSymbolString);

    }

    private static String isItsoecialSymbol(String text) {
        String specialSymbolString = "";
        for (int i = 0; i < text.length(); i++) {
            char currentElement = text.charAt(i);

            if (!Character.isLetterOrDigit(currentElement)){
                specialSymbolString += currentElement;
            }
        }

        return specialSymbolString;
    }

    private static String isItLetter(String text) {
        String letterString = "";
        for (int i = 0; i < text.length(); i++) {
            char currentElement = text.charAt(i);

            if (Character.isLetter(currentElement)){
                letterString += currentElement;
            }
        }

        return letterString;
    }

    private static String isItDigit(String text) {
        String numberString = "";
        for (int i = 0; i < text.length(); i++) {
            char currentElement = text.charAt(i);

            if (Character.isDigit(currentElement)) {
                numberString += currentElement;
            }
        }
        return numberString;
    }
}
