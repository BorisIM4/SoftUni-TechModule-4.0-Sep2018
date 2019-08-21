package L9_Lists_arrays_adcvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P5_List_Manipulation_Advanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.
                stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String input = scanner.nextLine();
        while (!input.equals("end")){
            String command = input.split(" ")[0];

            if (command.equals("Contains")){
                int value = Integer.parseInt(input.split(" ")[1]);
                if (numberList.contains(value)){
                    System.out.println("Yes");
                }else {
                    System.out.println("No such number");
                }
            } else if (command.equals("Print")){
                String finalCommand = input.split(" ")[1];
                if (finalCommand.equals("even")){
                    for (int element:numberList) {
                        if (element % 2 == 0){
                            System.out.print(element + " ");
                        }
                    }
                    System.out.println();
                }else if (finalCommand.equals("odd")){
                    for (int element:numberList) {
                        if (element % 2 != 0){
                            System.out.print(element + " ");
                        }
                    }
                    System.out.println();
                }
            } else if (input.equals("Get sum")){
                int sum = 0;
                for (int element:numberList) {
                    sum += element;
                }
                System.out.println(sum);
            } else if (command.equals("Filter")){
                String condition = input.split(" ")[1];
                int value = Integer.parseInt(input.split(" ")[2]);

                if (condition.equals("<")){
                    for (int element:numberList) {
                        if (element < value){
                            System.out.print(element + " ");
                        }
                    }
                } else if (condition.equals(">")){
                    for (int element:numberList) {
                        if (element > value){
                            System.out.print(element + " ");
                        }
                    }
                } else if (condition.equals("<=")){
                    for (int element:numberList) {
                        if (element <= value){
                            System.out.print(element + " ");
                        }
                    }
                } else if (condition.equals(">=")){
                    for (int element:numberList) {
                        if (element >= value){
                            System.out.print(element + " ");
                        }
                    }
                }
                System.out.println();
            }

            input = scanner.nextLine();
        }
    }
}
