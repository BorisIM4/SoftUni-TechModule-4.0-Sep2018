package L9_Lists_arrays_adcvanced;

import java.text.DecimalFormat;
import java.util.Random;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class L1_Sum_Adjacent_Equal_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        int lenghtOfNumberList = numberList.size();
        for (int i = 0; i < numberList.size() - 1; i++) {
            double currendtElementOne = numberList.get(i);
            double currendtElementTwo = numberList.get(i+1);


            if (currendtElementOne == currendtElementTwo){
                double sum = currendtElementOne + currendtElementTwo;
                numberList.remove(i);
                numberList.remove(i);
                numberList.add(i,sum);

                i = -1;
            }


        }
        DecimalFormat format = new DecimalFormat("#.###");
        for (double element:numberList) {
            System.out.print(format.format(element) + " ");
        }

    }
}
