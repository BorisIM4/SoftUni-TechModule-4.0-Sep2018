package L1_Basic_syntax_exercise;

import java.util.Scanner;

public class P3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGuests = Integer.parseInt(scanner.nextLine());
        String typeOfGuests = scanner.nextLine();
        String dayForVacation = scanner.nextLine();

        double totalPrice = 0;

        double newTotalPrice = 0;
        int newNumberOfGuests = 0;


        if (typeOfGuests.equals("Students")) {
            if (dayForVacation.equals("Friday")) {
                totalPrice = numberOfGuests * 8.45;
            }else if (dayForVacation.equals("Saturday")){
                totalPrice = numberOfGuests * 9.80;
            }else if (dayForVacation.equals("Sunday")){
                totalPrice = numberOfGuests * 10.46;
            }
            //discount for students
            if (numberOfGuests >= 30) {
                newTotalPrice = totalPrice * 85/100;
            }else {
                newTotalPrice = totalPrice;
            }

        }else if (typeOfGuests.equals("Business")){
            if (dayForVacation.equals("Friday")) {
                totalPrice = numberOfGuests * 10.90;
            }else if (dayForVacation.equals("Saturday")){
                totalPrice = numberOfGuests * 15.60;
            }else if (dayForVacation.equals("Sunday")){
                totalPrice = numberOfGuests * 16.00;
            }
            //discount for Business
            if (numberOfGuests >= 100) {
                newNumberOfGuests = numberOfGuests - 10;
                if (dayForVacation.equals("Friday")) {
                    newTotalPrice = newNumberOfGuests * 10.90;
                }else if (dayForVacation.equals("Saturday")){
                    newTotalPrice = newNumberOfGuests * 15.60;
                }else if (dayForVacation.equals("Sunday")){
                    newTotalPrice = newNumberOfGuests * 16.00;
                }
            }else {
                newTotalPrice = totalPrice;
            }

        }else if (typeOfGuests.equals("Regular")){
            if (dayForVacation.equals("Friday")) {
                totalPrice = numberOfGuests * 15.00;
            }else if (dayForVacation.equals("Saturday")){
                totalPrice = numberOfGuests * 20.00;
            }else if (dayForVacation.equals("Sunday")){
                totalPrice = numberOfGuests * 22.50;
            }
            //discount for regular
            if (numberOfGuests >= 10 && numberOfGuests <= 20) {
                newTotalPrice = totalPrice * 95/100;
            }else {
                newTotalPrice = totalPrice;
            }

        }

        System.out.printf("Total price: %.2f" ,newTotalPrice);

    }
}
