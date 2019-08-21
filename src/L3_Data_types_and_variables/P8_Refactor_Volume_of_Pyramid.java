package L3_Data_types_and_variables;

import java.util.Scanner;

public class P8_Refactor_Volume_of_Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Length: ");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        double height = Double.parseDouble(scanner.nextLine());

        double volume;
        volume = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", volume);


    }
}
