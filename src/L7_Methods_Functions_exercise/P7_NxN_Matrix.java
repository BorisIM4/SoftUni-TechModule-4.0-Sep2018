package L7_Methods_Functions_exercise;

import java.util.Scanner;

public class P7_NxN_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printMatrix(number);
    }
    public static void printMatrix(int number){
        int controlumber = number;

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(controlumber + " ");
            }
            System.out.println();
        }
    }
}
