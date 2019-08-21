package L1_Basic_syntax;

import java.util.Scanner;

public class P4_Back_In_30_Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());


        int hoursInMinutes = hours * 60;
        int allMinutes = hoursInMinutes + minutes;

        int allMinutesPlus30 = allMinutes + 30;

        int newHours = allMinutesPlus30 / 60;
        int newMinutes = allMinutesPlus30 % 60;


        if (hours == 0 && minutes <= 30) {
            newHours = 0;
        }
        if (hours == 23 && minutes >= 30) {
            newHours = 0;
        }

        System.out.printf("%d:%02d",newHours ,newMinutes);


    }
}
