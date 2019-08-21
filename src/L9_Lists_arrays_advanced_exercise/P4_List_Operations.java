package L9_Lists_arrays_advanced_exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P4_List_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("End")){
            String command = input.split("\\s+")[0];

            if (command.equals("Add")){
                int element = Integer.parseInt(input.split("\\s+")[1]);

                integerList.add(element);
            } else if (command.equals("Insert")){
                int element = Integer.parseInt(input.split("\\s+")[1]);
                int index = Integer.parseInt(input.split("\\s+")[2]);

                if (index >= 0 && index < integerList.size()){
                    integerList.add(index, element);
                }else {
                    System.out.println("Invalid index");
                }
            } else if (command.equals("Remove")){
                int index = Integer.parseInt(input.split("\\s+")[1]);

                if (index >= 0 && index < integerList.size()){
                    integerList.remove(index);
                }else {
                    System.out.println("Invalid index");
                }
            } else if (command.equals("Shift")){
                String direction = input.split("\\s+")[1];
                int numberOfRotation = Integer.parseInt(input.split("\\s+")[2]);

                if (direction.equals("left")){
                    for (int i = 0; i < numberOfRotation; i++) {
                        int removedElement = integerList.remove(0);
                        integerList.add(removedElement);
                    }
                } else if (direction.equals("right")){
                    for (int i = 0; i < numberOfRotation; i++) {
                        int removerElement = integerList.remove(integerList.size()-1);
                        integerList.add(0, removerElement);
                    }
                }
            }
            input = scanner.nextLine();
        }

        System.out.println(integerList.toString().replaceAll("[\\[,\\]]",""));
    }
}
