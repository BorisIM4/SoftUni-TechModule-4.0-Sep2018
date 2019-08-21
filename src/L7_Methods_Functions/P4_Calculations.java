package L7_Methods_Functions;

import java.util.Scanner;

public class P4_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String calculationSign = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int result = giveResultFromCalculation(calculationSign, firstNumber, secondNumber);
        System.out.println(result);
    }

    static int giveResultFromCalculation(String sign, int firstNum, int secondNUm) {
        int result = 0;
        if (sign.equals("add")){
            result = firstNum + secondNUm;
            return result;
        } else if (sign.equals("subtract")){
            result = firstNum - secondNUm;
            return result;
        } else if (sign.equals("multiply")){
            result = firstNum * secondNUm;
            return result;
        } else
            result = firstNum / secondNUm;
        return result;
    }
}