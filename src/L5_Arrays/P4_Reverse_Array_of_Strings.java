package L5_Arrays;


import java.util.Scanner;

public class P4_Reverse_Array_of_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] textArray = scanner.nextLine().split(" ");

        for (int i = textArray.length - 1; i >= 0; i--) {
            System.out.print(textArray[i] + " ");
        }
    }
}
