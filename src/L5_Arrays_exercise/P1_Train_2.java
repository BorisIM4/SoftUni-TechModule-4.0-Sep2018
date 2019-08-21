package L5_Arrays_exercise;

import java.util.Scanner;

public class P1_Train_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfWagons = Integer.parseInt(scanner.nextLine());

        int[] wagonCount = new int[numberOfWagons];

        int sumOfPassengers = 0;

        for (int i = 0; i < numberOfWagons; i++) {
            int passengersInWagon = Integer.parseInt(scanner.nextLine());

            wagonCount[i] = passengersInWagon;

            sumOfPassengers += passengersInWagon;

        }

        for (int wagon:wagonCount) {
            System.out.print(wagon + " ");
        }
        System.out.println();
        System.out.println(sumOfPassengers);
    }
}
