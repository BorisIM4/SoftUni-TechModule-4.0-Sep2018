package L5_Arrays;

import java.util.Scanner;

public class P1_Day_of_Week_2_reshenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dayOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        int numberOfDay = Integer.parseInt(scanner.nextLine());
        int numberOfDayAsIndex = numberOfDay - 1;

        if (numberOfDayAsIndex >= 0 && numberOfDay < 8 ) {
            System.out.println(dayOfWeek[numberOfDayAsIndex]);
        }else {
            System.out.println("Invalid day!");
        }

    }
}
