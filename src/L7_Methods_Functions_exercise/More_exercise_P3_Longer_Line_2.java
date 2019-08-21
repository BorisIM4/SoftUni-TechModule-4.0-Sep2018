package L7_Methods_Functions_exercise;

import java.util.Scanner;

public class More_exercise_P3_Longer_Line_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //firs point
        double firstX = Double.parseDouble(scanner.nextLine());
        double firstY = Double.parseDouble(scanner.nextLine());
        double secondX =Double.parseDouble(scanner.nextLine());
        double secondY =Double.parseDouble(scanner.nextLine());
        //secon dpoint
        double thirdX = Double.parseDouble(scanner.nextLine());
        double thirdY = Double.parseDouble(scanner.nextLine());
        double fourtX = Double.parseDouble(scanner.nextLine());
        double fourtY = Double.parseDouble(scanner.nextLine());

        double lineOneLength = calculateDistance(firstX, firstY, secondX, secondY);
        double lineTwoLength = calculateDistance(thirdX, thirdY, fourtX, fourtY);



    }

    public static double calculateDistance(double fX, double fY, double sX , double sY){
        double distance = Math.sqrt(Math.pow((sX - fX), 2d)+Math.pow((sY - fY), 2d));
        return distance;
    }
}
