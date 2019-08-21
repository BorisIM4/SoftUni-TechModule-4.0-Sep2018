package L3_Data_types_and_variables_exercise;

import java.util.Scanner;

public class P4_Convert_Meters_to_Kilometres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distanceInMeters = Integer.parseInt(scanner.nextLine());

        double convertionFrommettersToKilometers = distanceInMeters * 1.0 / 1000;

        System.out.printf("%.2f",convertionFrommettersToKilometers);
    }
}
