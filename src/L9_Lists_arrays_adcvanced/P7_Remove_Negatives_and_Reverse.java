package L9_Lists_arrays_adcvanced;

import java.util.*;
import java.util.stream.Collectors;

public class P7_Remove_Negatives_and_Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> newNumberList = new ArrayList<>();

        for (int element:numberList) {
            if (element >= 0){
                newNumberList.add(element);
            }
        }
        Collections.reverse(newNumberList);

        if (newNumberList.size() <= 0){
            System.out.println("empty");
        } else {
            for (int element:newNumberList) {
                System.out.print(element + " ");
            }
        }
    }
}
