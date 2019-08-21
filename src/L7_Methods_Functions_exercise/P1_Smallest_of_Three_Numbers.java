package L7_Methods_Functions_exercise;

import java.util.Scanner;

public class P1_Smallest_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberThree = Integer.parseInt(scanner.nextLine());

        printSmallestOfThreeInt(numberOne, numberTwo, numberThree);
    }
    static void printSmallestOfThreeInt(int first, int second, int third){
        if (first < second && first < third){
            System.out.println(first);
        } else if (second < first && second < third){
            System.out.println(second);
        } else {
            System.out.println(third);
        }

    }

}
