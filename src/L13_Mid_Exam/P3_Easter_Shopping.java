package L13_Mid_Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P3_Easter_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shopList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String input = scanner.nextLine();

            String command = input.split("\\s+")[0];

            if (command.equals("Include")){
                String shop = input.split("\\s+")[1];
                shopList.add(shop);
            } else if (command.equals("Visit")){
                String position = input.split("\\s+")[1];
                int numberOfremoves = Integer.parseInt(input.split("\\s+")[2]);

                if (shopList.size() < numberOfremoves){
                    continue;
                }else {
                    if (position.equals("first")){
                        for (int j = 0; j < numberOfremoves; j++) {
                            shopList.remove(0);
                        }
                    } else {
                        for (int j = 0; j < numberOfremoves; j++) {
                            shopList.remove(shopList.size() - 1);
                        }
                    }
                }
            } else if (command.equals("Prefer")){
                int shopIndexOne = Integer.parseInt(input.split("\\s+")[1]);
                int shopIndexTwo = Integer.parseInt(input.split("\\s+")[2]);

                if (shopIndexOne < shopList.size() && shopIndexTwo < shopList.size()){
                    String firstShopForSwap = shopList.get(shopIndexOne);
                    String secondShopForSwap = shopList.get(shopIndexTwo);

                    shopList.set(shopIndexOne, secondShopForSwap);
                    shopList.set(shopIndexTwo,firstShopForSwap);
                }

            } else if (command.equals("Place")){
                String newShop = input.split("\\s+")[1];
                int newShopIndex = Integer.parseInt(input.split("\\s+")[2]);

                if (shopList.size() > newShopIndex){
                    shopList.add(newShopIndex + 1, newShop);
                }
            }
        }
        System.out.println("Shops left:");
        for (String element:shopList) {
            System.out.print(element + " ");
        }

    }
}
