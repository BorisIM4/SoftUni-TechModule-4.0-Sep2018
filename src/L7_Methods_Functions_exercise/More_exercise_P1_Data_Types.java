package L7_Methods_Functions_exercise;

import java.util.Scanner;

public class More_exercise_P1_Data_Types {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfData = scanner.nextLine();
        String valueOfData = scanner.nextLine();

        printResult(typeOfData, valueOfData);
    }

    public static void printResult(String type, String value){
        if (type.equals("int")){
            int number = Integer.parseInt(value);
            int result = multiplyIntByTwo(number);
            System.out.println(result);
        } else if (type.equals("real")){
            double number = Double.parseDouble(value);
            double result = multiplyDoubleByOneAndAHalf(number);
            System.out.printf("%.2f",result);
        } else {
            System.out.printf("$%s$",value);
        }

    }

    private static double multiplyDoubleByOneAndAHalf(double number) {
        return number * 1.5;
    }

    private static int multiplyIntByTwo(int number) {
        return number * 2;
    }
}
