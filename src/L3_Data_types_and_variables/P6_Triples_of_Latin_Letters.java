package L3_Data_types_and_variables;

import java.util.Scanner;

public class P6_Triples_of_Latin_Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char nAsChar = (char)(96 + n);

        for (char i = 'a'; i <= nAsChar; i++) {
            for (char j = 'a'; j <= nAsChar; j++) {
                for (char k = 'a'; k <= nAsChar; k++) {
                    System.out.print(i);
                    System.out.print(j);
                    System.out.print(k);
                    System.out.println();
                }
            }
        }
    }
}
