package L7_Methods_Functions;

import java.util.Scanner;

public class P3_Printing_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeOfTriagnle = Integer.parseInt(scanner.nextLine());

        printingATriangleByGivenSize(sizeOfTriagnle);
    }

    static void printingATriangleByGivenSize(int triangleSize){
        //top side
        for (int i = 1; i <= triangleSize; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //bottom side
        for (int i = triangleSize - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
