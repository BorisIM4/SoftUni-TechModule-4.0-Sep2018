package L11_Associative_arrays_exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P4_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> pricePerProduct = new LinkedHashMap<>();
        Map<String, Integer> quantityPerProduct = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String productName = input.split("\\s+")[0];
            double productPrice = Double.parseDouble(input.split("\\s+")[1]);
            int productQuantity = Integer.parseInt(input.split("\\s+")[2]);

            if (!pricePerProduct.containsKey(productName)) {
                pricePerProduct.put(productName, productPrice);
                quantityPerProduct.put(productName, productQuantity);
            } else {
                pricePerProduct.put(productName, productPrice);
                quantityPerProduct.put(productName, quantityPerProduct.get(productName) + productQuantity);
            }
            input = scanner.nextLine();
        }

        Map<String, Double> productFinalPrice = new LinkedHashMap<>();
        for (Map.Entry<String, Double> productPricePair : pricePerProduct.entrySet()) {
            for (Map.Entry<String, Integer> productQuantityPair : quantityPerProduct.entrySet()) {
                String firstMapProductName = productPricePair.getKey();
                String secondMapProductName = productQuantityPair.getKey();
                double currentProductPrice = productPricePair.getValue();
                int currentProductQuantity = productQuantityPair.getValue();
                double finalPrice = 0;

                if (firstMapProductName.equals(secondMapProductName)) {
                    finalPrice = currentProductPrice * currentProductQuantity;
                    productFinalPrice.put(firstMapProductName, finalPrice);
                }
            }
        }

        String pattern = "%s -> %.2f";
        for (Map.Entry<String, Double> kvp : productFinalPrice.entrySet()) {
            System.out.println(String.format(pattern, kvp.getKey(), kvp.getValue()));
        }
    }
}
