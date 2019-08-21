package L3_Data_types_and_variables_exercise;

import java.util.Scanner;

public class P3_Town_Info {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfTown = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int areaOfTown = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km",nameOfTown ,population ,areaOfTown);
    }
}
