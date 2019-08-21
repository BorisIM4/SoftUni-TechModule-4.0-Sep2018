package L13_Mid_Exam;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P3_Quests_Journal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] testArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }
    }
}
