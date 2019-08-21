package L13_Mid_Exam;

import java.util.Scanner;

public class P2_Easter_Gifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] gifts = scanner.nextLine().split("\\s+");

        String input = scanner.nextLine();

        while (!input.equals("No Money")){
            String command = input.split("\\s+")[0];

            if (command.equals("OutOfStock")){
                String controlGift = input.split("\\s+")[1];

                for (int i = 0; i < gifts.length; i++) {
                    if (gifts[i].equals(controlGift)){
                        gifts[i] = "None";
                    }
                }
            } else if (command.equals("Required")){
                String newGift = input.split("\\s+")[1];
                int currentIndex = Integer.parseInt(input.split("\\s+")[2]);

                if (currentIndex <= gifts.length - 1 && currentIndex > 0 ){
                    gifts[currentIndex] = newGift;
                }
            } else if (command.equals("JustInCase")){
                String newGift = input.split("\\s+")[1];

                gifts[gifts.length - 1] = newGift;
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < gifts.length; i++) {
            if (gifts[i] != "None"){
                System.out.print(gifts[i] + " ");
            }


        }

    }
}
