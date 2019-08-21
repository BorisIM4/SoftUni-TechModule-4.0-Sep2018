package L5_Arrays_exercise;

import java.util.Scanner;

public class P2_Common_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstTestedArray = scanner.nextLine().split(" ");
        String[] secondTestedArray = scanner.nextLine().split(" ");

        for (int i = 0; i < secondTestedArray.length; i++) {
            for (int j = 0; j < firstTestedArray.length; j++) {

                if (secondTestedArray[i].equals(firstTestedArray[j])) {
                    System.out.print(firstTestedArray[j] + " ");
                }


            }
        }

    }
}
