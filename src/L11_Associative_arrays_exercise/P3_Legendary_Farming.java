package L11_Associative_arrays_exercise;

import java.util.*;

public class P3_Legendary_Farming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isItObtained = false;

        Map<String, Integer> importantPieces = new HashMap<>();
        importantPieces.put("shards", 0);
        importantPieces.put("fragments", 0);
        importantPieces.put("motes", 0);
        Map<String, Integer> junkPieces = new TreeMap<>();
        while (!isItObtained) {
            String[] input = scanner
                    .nextLine()
                    .split("\\s+");

            for (int i = 0; i < input.length - 1; i += 2) {
                String materialType = input[i + 1].toLowerCase();
                int materialQuantity = Integer.parseInt(input[i]);

                if (materialType.equals("shards") || materialType.equals("fragments") ||
                        materialType.equals("motes")) {
                    importantPieces.put(materialType, importantPieces.get(materialType) + materialQuantity);

                    if (importantPieces.get(materialType) >= 250) {
                        importantPieces.put(materialType, importantPieces.get(materialType) - 250);
                        if (materialType.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (materialType.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else {
                            System.out.println("Dragonwrath obtained!");
                        }
                        isItObtained = true;
                        break;
                    }

                } else {
                    if (!junkPieces.containsKey(materialType)) {
                        junkPieces.put(materialType, materialQuantity);
                    } else {
                        junkPieces.put(materialType, junkPieces.get(materialType) + materialQuantity);
                    }
                }
            }
        }

        //.sorted((a, b) -> {
        //      if(a.getValue() - b.getValue() == 0) {
        //          return a.getKey().compareTo(b.getKey());
        //      } else {
        //          return a.getValue() - b.getValue()
        //      }
        // })
        importantPieces.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> {
                    System.out.println(String.format("%s: %d", entry.getKey(), entry.getValue()));
                });

        junkPieces.entrySet().stream().forEach(entry -> {
            System.out.println(String.format("%s: %d", entry.getKey(), entry.getValue()));
        });
    }
}
