package L7_Methods_Functions;

import java.util.Scanner;

public class P6_Calculate_Rectangle_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        double areaOfRectangle = findAreaOfRectangle(width, length);
        System.out.printf("%.0f",areaOfRectangle);
    }

    static double findAreaOfRectangle(int oneSide, int otherdSide){
        int result = oneSide * otherdSide;
        return result;
    }
}
