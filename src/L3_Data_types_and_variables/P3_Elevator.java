package L3_Data_types_and_variables;

import java.util.Scanner;

public class P3_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOfPeople = Double.parseDouble(scanner.nextLine());
        double elevatorCapacity = Double.parseDouble(scanner.nextLine());

        double numberOfCourses = numberOfPeople / elevatorCapacity;
        double ceillNumberOfCourses = Math.ceil(numberOfCourses);

        int finalNumberOfCourses = (int)ceillNumberOfCourses;

        System.out.println(finalNumberOfCourses);
    }
}
