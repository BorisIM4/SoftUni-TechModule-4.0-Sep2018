package L9_Lists_arrays_advanced_exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2_Change_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")){
            String command = input.split("\\s+")[0];

            if (command.equals("Delete")){
                long value = Long.parseLong(input.split("\\s+")[1]);

                integerList.removeIf(element -> (element == value));

            } else if (command.equals("Insert")){
                int value = Integer.parseInt(input.split("\\s+")[1]);
                int index = Integer.parseInt(input.split("\\s+")[2]);

                if (index < integerList.size() && index >= 0){
                    integerList.add(index, value);
                }
            }

            input = scanner.nextLine();
        }

        for (int element:integerList) {
            System.out.print(element + " ");
        }
    }
}
