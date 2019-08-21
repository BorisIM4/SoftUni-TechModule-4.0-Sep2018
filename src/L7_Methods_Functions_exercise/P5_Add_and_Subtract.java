package L7_Methods_Functions_exercise;

import java.util.Scanner;

public class P5_Add_and_Subtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdtNumber = Integer.parseInt(scanner.nextLine());

        int sumeOfTwoNumber = sumOfTwoNumbers(firstNumber, secondNumber);
        int subtractOfTwoNumbers = subtractOfTwoNumbers(sumeOfTwoNumber, thirdtNumber);

        printResult(subtractOfTwoNumbers);
    }
    public static void printResult(int result){
        System.out.println(result);;

    }

    private static int subtractOfTwoNumbers(int sumeOfTwoNumber, int thirdtNumber) {
        int resultOfSubtrract = sumeOfTwoNumber - thirdtNumber;

        return resultOfSubtrract;
    }

    private static int sumOfTwoNumbers(int firstNumber, int secondNumber) {
        int resultOfSum = firstNumber + secondNumber;

        return resultOfSum;
    }


}
