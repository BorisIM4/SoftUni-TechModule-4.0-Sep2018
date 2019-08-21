package L3_Data_types_and_variables;

import java.util.Scanner;

public class P4_Centuries_to_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCenturies = Integer.parseInt(scanner.nextLine());

        int numberOfYearsInCenture = numberOfCenturies * 100;
        double numberOfDaysInYear = numberOfYearsInCenture * 365.2422;
        int numberOfHoursInDay = (int)numberOfDaysInYear * 24;

        int numberOfMinutesInHour = numberOfHoursInDay * 60;

        System.out.println(numberOfMinutesInHour);
    }
}
