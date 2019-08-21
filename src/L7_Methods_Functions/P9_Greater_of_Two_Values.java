package L7_Methods_Functions;

import java.util.Scanner;

public class P9_Greater_of_Two_Values {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        if (type.equals("int")){
            int firstValue = Integer.parseInt(scanner.nextLine());
            int secondValue = Integer.parseInt(scanner.nextLine());
            int result = greaterThatTwoValues(firstValue, secondValue);
            System.out.println(result);
        } else if (type.equals("char")){
            char firstValue = scanner.nextLine().charAt(0);
            char secondValue = scanner.nextLine().charAt(0);
            char result = greaterThatTwoValues(firstValue, secondValue);
            System.out.println(result);
        } else {
            String firstValue = scanner.nextLine();
            String secondValue = scanner.nextLine();
            String result = greaterThatTwoValues(firstValue, secondValue);
            System.out.println(result);
        }
    }

    static int greaterThatTwoValues(int first, int second){
        if (first > second){
            return first;
        }else {
            return second;
        }
    }
    static char greaterThatTwoValues(char first, char second){
        if (first > second){
            return first;
        }else {
            return second;
        }
    }
    static String greaterThatTwoValues(String first, String second){
        if (first.compareTo(second) >= 0){
            return first;
        }else {
            return second;
        }
    }

}
