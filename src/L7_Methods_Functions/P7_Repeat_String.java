package L7_Methods_Functions;

import java.util.Scanner;

public class P7_Repeat_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String someText = scanner.nextLine();
        int numbersOfRepeatsOfSomeText = Integer.parseInt(scanner.nextLine());

        String newText = repeatsTextByGivenTimes(someText, numbersOfRepeatsOfSomeText);
        System.out.println(newText);
    }

    static String repeatsTextByGivenTimes(String text, int timesToRepeats){
        String result = "";
        for (int i = 0; i < timesToRepeats; i++) {
            result += text;
        }
        return result;
    }
}
