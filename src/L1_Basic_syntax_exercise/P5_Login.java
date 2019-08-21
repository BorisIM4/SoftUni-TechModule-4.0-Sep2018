package L1_Basic_syntax_exercise;

import java.util.Scanner;

public class P5_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int counter = 0;

        while (true){
            String password = scanner.nextLine();

            String reverseName = new StringBuilder(name).reverse().toString();

            if (password.equals(reverseName)) {
                System.out.printf("User %s logged in." ,name);
                break;
            }else {
                System.out.println("Incorrect password. Try again.");
            }

            counter++;

            if (counter == 3) {
                System.out.printf("User %s blocked!" ,name);
                break;
            }

        }
    }
}
