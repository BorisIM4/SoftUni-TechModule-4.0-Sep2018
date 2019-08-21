package L13_Mid_Exam;

import java.util.Scanner;

public class P1_Party_Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfCompenion = Integer.parseInt(scanner.nextLine());
        int numberOfDays = Integer.parseInt(scanner.nextLine());

        int coinsPerDay = 50;
        int coinsForFood = 2;
        int day3Minus = 3;
        int day5Plus = 20;
        int day5Minus = 2;


        int sumOfCoins = 0;

        for (int i = 1; i <= numberOfDays; i++) {
            if (i % 10 == 0){
                numberOfCompenion -= 2;
            }
            if (i % 15 == 0) {
                numberOfCompenion += 5;
            }

            sumOfCoins += coinsPerDay;
            sumOfCoins -= coinsForFood * numberOfCompenion;

            if (i % 3 == 0){
                sumOfCoins -= numberOfCompenion * day3Minus;
            }
            if (i % 5 == 0){
                sumOfCoins += numberOfCompenion * day5Plus;
                if (i % 3 == 0){
                    sumOfCoins -= numberOfCompenion * day5Minus;
                }
            }

        }
        int sumPerCompanion = sumOfCoins / numberOfCompenion;
        System.out.printf("%d companions received %d coins each." ,numberOfCompenion ,sumPerCompanion);

    }
}
