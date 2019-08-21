package L9_Lists_arrays_advanced_exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P1_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int wagonCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        System.out.println();
        while (!input.equals("end")){
            String command = input.split(" ")[0];

            if (command.equals("Add")){
                int additionalWagon = Integer.parseInt(input.split(" ")[1]);
                numberList.add(additionalWagon);

            }else {
                int currentnumberOfNewPassanger = Integer.parseInt(input.split(" ")[0]);

                for (int i = 0; i < numberList.size(); i++) {
                    int currentNumberOfPassangerInWagon = numberList.get(i);

                    if (currentNumberOfPassangerInWagon + currentnumberOfNewPassanger <= wagonCapacity){
                        int sum = currentNumberOfPassangerInWagon + currentnumberOfNewPassanger;

                        numberList.set(i, sum);

                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }

        for (int element:numberList) {
            System.out.print(element + " ");
        }
    }
}

