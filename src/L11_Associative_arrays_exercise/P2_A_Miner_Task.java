package L11_Associative_arrays_exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P2_A_Miner_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resourceMap = new LinkedHashMap<>();
        String inputResource = scanner.nextLine();
        int inputQuntity = Integer.parseInt(scanner.nextLine());
        while (!inputResource.equals("stop")) {
            resourceMap.putIfAbsent(inputResource, 0);
            int currentQuantityValue = resourceMap.get(inputResource);
            resourceMap.put(inputResource, currentQuantityValue + inputQuntity);

            inputResource = scanner.nextLine();
            if (!inputResource.equals("stop")) {
                inputQuntity = Integer.parseInt(scanner.nextLine());
            }
        }

        String pattern = "%s -> %d";
        for (Map.Entry<String, Integer> kvp : resourceMap.entrySet()) {
            System.out.println(String.format(pattern
                    , kvp.getKey()
                    , kvp.getValue()));

        }
    }
}
