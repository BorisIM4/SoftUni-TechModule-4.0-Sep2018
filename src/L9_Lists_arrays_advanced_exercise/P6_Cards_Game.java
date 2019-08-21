package L9_Lists_arrays_advanced_exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P6_Cards_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerCards = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondPlayerCards = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sizeOfFirst = firstPlayerCards.size();
        int sizeSecond = secondPlayerCards.size();

        int numberOfRotation = 0;
        if (sizeOfFirst > sizeSecond){
            numberOfRotation = sizeSecond;
        } else {
            numberOfRotation = sizeOfFirst;
        }

        for (int i = 0; i < numberOfRotation; i++) {
            for (int j = 0; j < numberOfRotation; j++) {
                int currentHandOfFirst = firstPlayerCards.get(i);
                int currentHandOfSecond = secondPlayerCards.get(i);



            }
        }


    }
}

