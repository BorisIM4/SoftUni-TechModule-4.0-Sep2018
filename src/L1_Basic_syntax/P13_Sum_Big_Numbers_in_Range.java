package L1_Basic_syntax;

import java.math.BigInteger;
import java.util.Scanner;

public class P13_Sum_Big_Numbers_in_Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger result = BigInteger.valueOf(0);

        BigInteger first = new BigInteger(scanner.nextLine());
        BigInteger second = new BigInteger(scanner.nextLine());
        for (BigInteger i = first; i.compareTo(second) <= 0; i = i.add(BigInteger.valueOf(1))) {

            result = result.add(i);

        }
        System.out.println(result);

        /*int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;

        }
        System.out.println(sum);*/
    }

}
