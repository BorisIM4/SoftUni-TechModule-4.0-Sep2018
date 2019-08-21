package L7_Methods_Functions_exercise;

import java.util.Scanner;

public class P2_Vowels_Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String someText = scanner.nextLine();

        int countOfVawels = countVawelsInString(someText);
        System.out.println(countOfVawels);
    }
    public static int countVawelsInString(String text){
        int count = 0;
        String[] textAsaArr = text.split("");

        for (int i = 0; i < text.length(); i++) {
            if (textAsaArr[i].equals("A") || textAsaArr[i].equals("a")
                    || textAsaArr[i].equals("O") || textAsaArr[i].equals("o")
                    || textAsaArr[i].equals("U") || textAsaArr[i].equals("u")
                    || textAsaArr[i].equals("E") || textAsaArr[i].equals("e")
                    || textAsaArr[i].equals("I") || textAsaArr[i].equals("i")){
                count += 1;
            }
        }

        return count;
    }

}
