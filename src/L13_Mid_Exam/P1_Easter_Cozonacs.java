package L13_Mid_Exam;

import java.util.Scanner;

public class P1_Easter_Cozonacs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double floorPriceForilogram = Double.parseDouble(scanner.nextLine());

        double eggPriceForPack = floorPriceForilogram * 75 / 100;

        double milkPriceForLiter = floorPriceForilogram + (floorPriceForilogram * 25 / 100);
        double milkPriceForoneCourterOfLiter = milkPriceForLiter / 4;

        double priceForCozunak = floorPriceForilogram + eggPriceForPack + milkPriceForoneCourterOfLiter;

        double currentBudget = budget;
        long numberOfCozunaks = 0;
        long numberOfEggs = 0;

        while (budget >= priceForCozunak){
            currentBudget = budget - priceForCozunak;
            budget = currentBudget;
            numberOfCozunaks++;
            numberOfEggs += 3;

            if (numberOfCozunaks % 3 == 0){
                long subtractEggs = numberOfCozunaks - 2;
                numberOfEggs -= subtractEggs;
            }

        }

        System.out.printf("You made %d cozonacs! Now you have %d eggs and %.2fBGN left.",numberOfCozunaks ,numberOfEggs, currentBudget);
    }
}
