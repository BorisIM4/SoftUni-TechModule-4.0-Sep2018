package L5_Arrays;

import java.util.Scanner;

public class P6_Equal_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumFirstArray = 0;

        String[] textArrayFirst = scanner.nextLine().split(" ");
        int[] integersArrayFirst = new int[textArrayFirst.length];

        String[] textArraySecond = scanner.nextLine().split(" ");
        int[] integersArraySecond = new int[textArraySecond.length];

        for (int i = 0; i < textArrayFirst.length; i++) {
            integersArrayFirst[i] = Integer.parseInt(textArrayFirst[i]);
            sumFirstArray += integersArrayFirst[i];
        }

        for (int i = 0; i < textArraySecond.length; i++) {
            integersArraySecond[i] = Integer.parseInt(textArraySecond[i]);
        }

        boolean checker = true;
        int breakeIndex = 0;

        for (int i = 0; i < integersArrayFirst.length; i++) {
            if (integersArrayFirst[i] == integersArraySecond[i]) {
                checker = true;
            } else {
                checker = false;
                breakeIndex = i;
                break;
            }
        }

        if (checker) {
            System.out.printf("Arrays are identical. Sum: %d" ,sumFirstArray);
        }else {
            System.out.printf("Arrays are not identical. Found difference at %d index." ,breakeIndex);
        }
    }
}
