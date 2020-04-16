package L16_String_and_Text_Processing;

import java.util.Scanner;

public class P3_Reverse_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("end")){
            String reversiInput = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                reversiInput += input.charAt(i);
            }

            String pattern = "%s = %s";
            System.out.println(String.format(pattern, input, reversiInput));

            input = scanner.nextLine();
        }
    }
}
