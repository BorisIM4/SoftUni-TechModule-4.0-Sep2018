package L3_Data_types_and_variables;

import java.util.Scanner;

public class P6_Triples_of_Latin_Letters_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (char i = 'a'; i < 'a' + number; i++) {
            for (char j = 'a'; j < 'a' + number; j++) {
                for (char k = 'a'; k < 'a' + number; k++) {
                    System.out.println("" + i + j + k);
                }
            }
        }
    }
}
