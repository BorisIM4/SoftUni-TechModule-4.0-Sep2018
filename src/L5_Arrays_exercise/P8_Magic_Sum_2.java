package L5_Arrays_exercise;

import java.util.Scanner;

public class P8_Magic_Sum_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] textArray = scanner.nextLine().split(" ");
        int[] integereArray = new int[textArray.length];

        for (int i = 0; i < textArray.length; i++) {
            integereArray[i] = Integer.parseInt(textArray[i]);
        }

        int testedNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < integereArray.length - 1; i++) {
            for (int j = i + 1; j < integereArray.length; j++) {
                if (integereArray[i] + integereArray[j] == testedNumber){
                    System.out.println(integereArray[i] + " " + integereArray[j]);
                }
            }
        }
    }
}
