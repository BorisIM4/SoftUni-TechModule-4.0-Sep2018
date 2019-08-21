package L7_Methods_Functions_exercise;

import java.util.Scanner;

public class More_exercise_P2_Center_Point {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstPointX = Double.parseDouble(scanner.nextLine());
        double firstPointY = Double.parseDouble(scanner.nextLine());
        double secondPointX = Double.parseDouble(scanner.nextLine());
        double secondPointY = Double.parseDouble(scanner.nextLine());

        prinCoordinateClosestToZero(firstPointX, firstPointY, secondPointX, secondPointY);
    }

    public static void prinCoordinateClosestToZero(double fX, double fY, double sX, double sY){
        double firstPointDistance = calculateTheDistanceFromPointToZero(fX,fY);
        double secondPointDistance = calculateTheDistanceFromPointToZero(sX, sY);

        if (firstPointDistance < secondPointDistance){
            System.out.printf("(%.0f, %.0f)",fX,fY);
        } else {
            System.out.printf("(%.0f, %.0f)",sX,sY);
        }

    }

    public static double calculateTheDistanceFromPointToZero(double xPosition, double yPosition){
        double distance = Math.sqrt(Math.pow(xPosition, 2) + Math.pow(yPosition, 2));
        return distance;
    }

}
