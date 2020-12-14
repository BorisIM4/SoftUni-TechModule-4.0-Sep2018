package L17_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1_March_Full_Name_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\b(?<firstName>[A-Z]{1}[a-z]+) (?<secondName>[A-Z]{1}[a-z]+)\\b";
        String inputText = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputText);

        while (matcher.find()){
            String firstName = matcher.group("firstName");
            String secondName = matcher.group("secondName");

            System.out.printf("First name: %s - Second name: %s!%n"
                    ,firstName
                    ,secondName);
        }
    }
}
