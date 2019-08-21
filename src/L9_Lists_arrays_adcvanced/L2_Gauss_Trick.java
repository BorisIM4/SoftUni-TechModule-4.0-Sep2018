package L9_Lists_arrays_adcvanced;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class L2_Gauss_Trick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> inputAsStringList = new ArrayList<>(Arrays.asList(input.split(" ")));

        List<Integer> numberList = new ArrayList<>();

        for (int i = 0; i < inputAsStringList.size(); i++) {
            numberList.add(Integer.parseInt(inputAsStringList.get(i)));

        }

        printList(sumOffurstAndLastElementInList(numberList));

    }

    public static void printList(List<Integer> numbListForPrint){
        for (int element:numbListForPrint) {
            System.out.print(element + " ");
        }
    }

    public static List<Integer> sumOffurstAndLastElementInList(List<Integer> numbList){
        List<Integer> summedNumberList = new ArrayList<>();
        if (numbList.size() % 2 == 0){
            for (int i = 0; i < numbList.size() / 2; i++) {
                int firstElement = numbList.get(i);
                int secondElement = numbList.get(numbList.size() - (i + 1));
                int sum = firstElement + secondElement;
                summedNumberList.add(sum);
            }

            return summedNumberList;
        }else {
            for (int i = 0; i < numbList.size() / 2; i++) {
                int firstElement = numbList.get(i);
                int secondElement = numbList.get(numbList.size() - (i + 1));
                int sum = firstElement + secondElement;
                summedNumberList.add(sum);
            }
            int lastElement = numbList.get(numbList.size() / 2);
            summedNumberList.add(lastElement);

            return summedNumberList;
        }
    }
}
