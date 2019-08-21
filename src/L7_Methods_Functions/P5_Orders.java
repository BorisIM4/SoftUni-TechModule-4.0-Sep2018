package L7_Methods_Functions;

import java.util.Scanner;

public class P5_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productName = scanner.nextLine();
        int cuantity = Integer.parseInt(scanner.nextLine());

        printPriceForAllProduct(productName, cuantity);
    }

    static void printPriceForAllProduct(String product, int cuantity){
        double fullPrice = 0;

        if (product.equals("coffee")){
            fullPrice = cuantity * 1.50;
        } else if (product.equals("water")){
            fullPrice = cuantity * 1.00;
        } else if (product.equals("coke")){
            fullPrice = cuantity * 1.40;
        } else if (product.equals("snacks")){
            fullPrice = cuantity * 2.00;
        }

        System.out.printf("%.2f",fullPrice);
    }
}
