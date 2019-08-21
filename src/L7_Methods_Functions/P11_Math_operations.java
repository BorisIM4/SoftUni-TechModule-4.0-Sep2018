package L7_Methods_Functions;

import java.util.Scanner;

public class P11_Math_operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        String operatorSign = scanner.nextLine();
        double secondNumber = Double.parseDouble(scanner.nextLine());

        double result = resultOfOperationsOfTwoNumbers(operatorSign, firstNumber, secondNumber);
        System.out.printf("%.0f",result);
    }
    static double resultOfOperationsOfTwoNumbers(String operatot, double first, double second){
        if (operatot.equals("+")){
            return first + second;
        }else if (operatot.equals("-")){
            return first - second;
        }else if (operatot.equals("*")){
            return first * second;
        }else {
            return first / second;
        }
    }

}
