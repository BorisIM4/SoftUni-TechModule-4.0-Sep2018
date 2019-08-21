package L9_Lists_arrays_adcvanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P6_List_of_Products {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        List<String> productlist = new ArrayList<>(number);

        for (int i = 0; i < number; i++) {
            String product = scanner.nextLine();
            productlist.add(product);
        }

        Collections.sort(productlist);

        for (int i = 0; i < number; i++) {
            String currentProduct = productlist.get(i);
            System.out.printf("%d.%s%n",i+1 ,currentProduct);
        }

    }
}
