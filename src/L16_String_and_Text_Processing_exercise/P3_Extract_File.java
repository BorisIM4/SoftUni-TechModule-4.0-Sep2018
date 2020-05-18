package L16_String_and_Text_Processing_exercise;

import java.util.Scanner;

public class  P3_Extract_File {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder fileUrl = new StringBuilder(scanner.nextLine());

        String file = fileUrl.substring(fileUrl.lastIndexOf("\\") + 1);

        String[] fileAsArr = file.split("\\.");

        System.out.println(String.format("File name: %s", fileAsArr[0]));
        System.out.println(String.format("File extension: %s", fileAsArr[1]));
    }
}
