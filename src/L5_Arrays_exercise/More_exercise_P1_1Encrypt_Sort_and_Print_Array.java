package L5_Arrays_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class More_exercise_P1_1Encrypt_Sort_and_Print_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfnames = Integer.parseInt(scanner.nextLine());

        int[] resultArray = new int[numberOfnames];

        for (int i = 0; i < numberOfnames; i++) {
            String nameAsString = scanner.nextLine();
            char[] charArray = nameAsString.toCharArray();

            int total = 0;
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[j] == 'a' ||
                        charArray[j] == 'o' ||
                        charArray[j] == 'u' ||
                        charArray[j] == 'e' ||
                        charArray[j] == 'i' ||
                        charArray[j] == 'A' ||
                        charArray[j] == 'O' ||
                        charArray[j] == 'U' ||
                        charArray[j] == 'E' ||
                        charArray[j] == 'I'){
                    char letterOfName = charArray[j];
                    int valueOfChar = (int)letterOfName;
                    total += valueOfChar * charArray.length;
                }else {
                    char letterOfName = charArray[j];
                    int valueOfChar = (int)letterOfName;
                    total += valueOfChar / charArray.length;
                }
            }
            resultArray[i] = total;
        }

        Arrays.sort(resultArray);

        for (int result:resultArray) {
            System.out.println(result);
        }
    }
}
