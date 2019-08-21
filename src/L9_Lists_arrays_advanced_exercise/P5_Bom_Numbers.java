package L9_Lists_arrays_advanced_exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P5_Bom_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> integerList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        int bombNumber = Integer.parseInt(input.split("\\s+")[0]);
        int powerNumber = Integer.parseInt(input.split("\\s+")[1]);

//        if (bombNumber < 0 || bombNumber >= integerList.size()){
//            return;
//        }

        for (int i = 0; i < integerList.size(); i++) {
            int currentElement = integerList.get(i);
            int currentSizeOflist = integerList.size();

            if (currentElement == bombNumber) {
                //clear front side
                if (powerNumber > i){
                    for (int j = 0; j < i; j++) {
                        integerList.remove(i);
                    }
                } else {
                    for (int j = 0; j < powerNumber; j++) {
                        integerList.remove(i-powerNumber);
                    }
                }
                //clear bomb number
                integerList.remove(i-powerNumber);

                //clear back side
                if (powerNumber > ((currentSizeOflist - 1) - i)){
                    for (int j = i; j < currentSizeOflist - 1; j++) {
                        integerList.remove(i-powerNumber);
                    }
                } else {
                    for (int j = 0; j < powerNumber; j++) {
                        integerList.remove(i-powerNumber);
                    }
                }

                i = 0;

            }


        }
        int listSum = 0;
        for (int element:integerList) {
            listSum += element;
        }
        System.out.println(listSum);
    }
}
