package L16_String_and_Text_Processing_exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P5_Multiply_Big_Number {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BigInteger firstNumber = new BigInteger(reader.readLine());
        BigInteger secondNumber = new BigInteger(reader.readLine());

        BigInteger result = firstNumber.multiply(secondNumber);
        System.out.println(result);
    }
}
