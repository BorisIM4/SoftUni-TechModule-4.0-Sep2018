package L5_Arrays_exercise;

import java.util.Scanner;

public class P2_Common_Elements_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstStrring = scanner.nextLine();
        String secondStrring = scanner.nextLine();

        String[] firstArray = firstStrring.split(" ");
        String[] secondArray = secondStrring.split(" ");

        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < firstArray.length; j++) {

                if (firstArray[j].equals(secondArray[i])) {
                    System.out.print(firstArray[j] + " ");
                }

            }
        }
    }
}
