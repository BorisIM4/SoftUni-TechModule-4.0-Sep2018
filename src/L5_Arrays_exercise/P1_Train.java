package L5_Arrays_exercise;

import java.util.Scanner;

public class P1_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfwagons = Integer.parseInt(scanner.nextLine());
        int[] numberOfPassengers = new int[numberOfwagons];

        int sumOfPassenger = 0;

        for (int i = 0; i < numberOfwagons; i++) {
            numberOfPassengers[i] = Integer.parseInt(scanner.nextLine());
            sumOfPassenger += numberOfPassengers[i];
        }

        for (int elements:numberOfPassengers) {
            System.out.print(elements + " ");
        }
        System.out.println();
        System.out.println(sumOfPassenger);
    }
}
