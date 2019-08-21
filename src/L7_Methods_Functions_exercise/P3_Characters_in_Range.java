package L7_Methods_Functions_exercise;

import java.util.Scanner;

public class P3_Characters_in_Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstCahr = scanner.nextLine().charAt(0);
        char secondCahr = scanner.nextLine().charAt(0);

        getCharsBetweenTwoChars(firstCahr, secondCahr);

    }
    public static void getCharsBetweenTwoChars(char start, char end){
        char startLoop = start;
        char endLoop = end;

        if (end < start){
            startLoop = end;
            endLoop = start;
        }

        for (int i = startLoop + 1; i < endLoop; i++) {
            char currentChar = (char) i;
            System.out.print(currentChar + " ");

        }


    }

}
