package L5_Arrays;

import java.util.Scanner;

public class P1_Day_of_Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDay = Integer.parseInt(scanner.nextLine());

        String[] dayOfWeek = new String[7];

        dayOfWeek[0] = "Monday";
        dayOfWeek[1] = "Tuesday";
        dayOfWeek[2] = "Wednesday";
        dayOfWeek[3] = "Thursday";
        dayOfWeek[4] = "Friday";
        dayOfWeek[5] = "Saturday";
        dayOfWeek[6] = "Sunday";

        switch (numberOfDay) {
            case 1:
                System.out.println(dayOfWeek[0]);
                break;
            case 2:
                System.out.println(dayOfWeek[1]);
                break;
            case 3:
                System.out.println(dayOfWeek[2]);
                break;
            case 4:
                System.out.println(dayOfWeek[3]);
                break;
            case 5:
                System.out.println(dayOfWeek[4]);
                break;
            case 6:
                System.out.println(dayOfWeek[5]);
                break;
            case 7:
                System.out.println(dayOfWeek[6]);
                break;
                default:
                    System.out.println("Invalid day!");
                    break;
        }

    }
}
