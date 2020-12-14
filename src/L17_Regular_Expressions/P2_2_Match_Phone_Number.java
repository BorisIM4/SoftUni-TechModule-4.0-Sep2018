package L17_Regular_Expressions;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2_2_Match_Phone_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\+359([- ])2(\\1)(\\d{3})(\\1)(\\d{4})\\b";
        String inputText = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputText);

        List<String> phonebook = new LinkedList<String>();
        while (matcher.find()){
            phonebook.add(matcher.group());
        }

        System.out.println(String.join(", ", phonebook));
    }
}
