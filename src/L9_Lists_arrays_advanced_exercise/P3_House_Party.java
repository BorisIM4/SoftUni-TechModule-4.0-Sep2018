package L9_Lists_arrays_advanced_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P3_House_Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfinputs = Integer.parseInt(scanner.nextLine());

        List<String> guestnames = new ArrayList<>();

        for (int i = 0; i < numberOfinputs; i++) {
            String input = scanner.nextLine();

            String keyWord = input.split("\\s+")[2];
            if (keyWord.equals("going!")){
                String name = input.split("\\s+")[0];

                if (guestnames.contains(name)){
                    System.out.printf("%s is already in the list!", name);
                    System.out.println();
                } else {
                    guestnames.add(name);
                }

            } else if (keyWord.equals("not")){
                String name = input.split("\\s+")[0];

                if (guestnames.contains(name)){
                    guestnames.remove(name);
                } else {
                    System.out.printf("%s is not in the list!", name);
                    System.out.println();
                }
            }
        }
        for (String name:guestnames) {
            System.out.println(name);
        }
    }
}
