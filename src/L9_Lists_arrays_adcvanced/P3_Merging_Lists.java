package L9_Lists_arrays_adcvanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P3_Merging_Lists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> firstList = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));
        List<String> secondList = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));

        List<String> mergedList = new ArrayList<>();
        if (firstList.size() < secondList.size()){
            for (int i = 0; i < firstList.size(); i++) {
                mergedList.add(firstList.get(i));
                mergedList.add(secondList.get(i));
            }

            List<String> lastPartToJoinList = secondList.subList(firstList.size(), secondList.size());

            mergedList.addAll(lastPartToJoinList);

            for (String element:mergedList){
                System.out.print(element + " ");
            }


        }else {
            for (int i = 0; i < secondList.size(); i++) {
                mergedList.add(firstList.get(i));
                mergedList.add(secondList.get(i));
            }

            List<String> lastPartToJoinList = firstList.subList(secondList.size(), firstList.size());

            mergedList.addAll(lastPartToJoinList);

            for (String element:mergedList){
                System.out.print(element + " ");
            }
        }
    }
}
