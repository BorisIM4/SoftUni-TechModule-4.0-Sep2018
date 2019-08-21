package L9_Lists_arrays_adcvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P4_List_Manipulation_Basics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")){
            String command = input.split(" ")[0];

            if (command.equals("Add")){
                int value = Integer.parseInt(input.split(" ")[1]);

                numberList.add(value);
            }else if (command.equals("Remove")){
                int value = Integer.parseInt(input.split(" ")[1]);

                numberList.removeIf(element -> (element == value));
            }else if (command.equals("RemoveAt")){
                int valueIndex = Integer.parseInt(input.split(" ")[1]);

                numberList.remove(valueIndex);
            }else if (command.equals("Insert")){
                int value = Integer.parseInt(input.split(" ")[1]);
                int index = Integer.parseInt(input.split(" ")[2]);

                numberList.add(index, value);
            }

            input = scanner.nextLine();
        }

        for (int element:numberList) {
            System.out.print(element + " ");
        }
    }
}
