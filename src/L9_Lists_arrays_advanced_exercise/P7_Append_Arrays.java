package L9_Lists_arrays_advanced_exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P7_Append_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] stringArray = input.split("\\|");

        List<String> stringList = new ArrayList<>();

        Collections.addAll(stringList, stringArray);

        Collections.reverse(stringList);

        String text = "";

        for (String element:stringList) {
            text += element + " ";
        }

        String textWitoutWhiteSpcases = text.trim();

        String[] newText = textWitoutWhiteSpcases.split("\\s+");

        for (String element:newText) {
            System.out.print(element + " ");
        }

    }
}
