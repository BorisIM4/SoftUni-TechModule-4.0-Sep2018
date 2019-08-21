package L7_Methods_Functions_exercise;

import java.util.Scanner;

public class More_exercise_P3_Longer_Line {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstX = Double.parseDouble(scanner.nextLine());
        double firstY = Double.parseDouble(scanner.nextLine());
        double secondX =Double.parseDouble(scanner.nextLine());
        double secondY =Double.parseDouble(scanner.nextLine());
        double thirdX = Double.parseDouble(scanner.nextLine());
        double thirdY = Double.parseDouble(scanner.nextLine());
        double fourtX = Double.parseDouble(scanner.nextLine());
        double fourtY = Double.parseDouble(scanner.nextLine());

        longerLine(firstX, firstY, secondX, secondY, thirdX, thirdY, fourtX, fourtY);

    }
    public static void longerLine(double fX, double fY, double sX, double sY, double tX, double tY, double fourX, double fourY){
        double firstLine = baseOfTriangle(fX, fY, sX, sY);
        double secondLine = baseOfTriangle(tX, tY, fourX, fourY);

        if (firstLine > secondLine){
            prinCoordinateClosestToZero(fX, fY, sX, sY);
        }else {
            prinCoordinateClosestToZero(tX, tY, fourX, fourY);
        }

    }


    // Tova e za chast 1.1
    public static double baseOfTriangle(double fX, double fY, double sX, double sY){
        double xSide = oneSideOftrinangle(fX, sX);
        double ySide = oneSideOftrinangle(fY, sY);
        double baseSide = Math.sqrt(Math.pow(xSide, 2) + Math.pow(ySide, 2));
        return baseSide;
    }
    // Tova e za chast 1.2
    public static double oneSideOftrinangle(double first, double second){
        if ((first > 0 && second > 0) || (first < 0 && second < 0)){
            double firstSide = Math.abs(first - second);
            return firstSide;
        } else {
            double firsSide = Math.abs(first + second);
            return firsSide;
        }
    }


    // Tova e za chast 2.1
    public static void prinCoordinateClosestToZero(double fX, double fY, double sX, double sY){
        double firstPointDistance = calculateTheDistanceFromPointToZero(fX,fY);
        double secondPointDistance = calculateTheDistanceFromPointToZero(sX, sY);

        if (firstPointDistance < secondPointDistance){
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",fX,fY,sX,sY);
        } else {
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",sX,sY,fX,fY);
        }

    }
    // Tova e za chast 2.2
    public static double calculateTheDistanceFromPointToZero(double xPosition, double yPosition){
        double distance = Math.sqrt(Math.pow(xPosition, 2) + Math.pow(yPosition, 2));
        return distance;
    }


}
