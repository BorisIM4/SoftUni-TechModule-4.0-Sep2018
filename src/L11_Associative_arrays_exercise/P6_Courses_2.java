package L11_Associative_arrays_exercise;

import java.util.*;

public class P6_Courses_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner
                .nextLine();
        Map<String, Set<String>> courcesMap = new LinkedHashMap<>();
        while (!"end".equals(input)){
            String courceName = input
                    .split(" : ")[0];
            String studentName = input
                    .split(" : ")[1];

            courcesMap.putIfAbsent(courceName, new TreeSet<>());
            courcesMap.get(courceName).add(studentName);

            input = scanner
                    .nextLine();
        }

        String pattern = "-- %s";
        courcesMap
                .entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(b.getValue().size(),
                        a.getValue().size()))
                .forEach(entry -> {
                    System.out.println(String.format("%s: %d"
                            ,entry.getKey()
                            ,entry.getValue().size()));
                            entry.getValue().forEach(element ->
                                    System.out.println(String.format(pattern, element)));
                });
    }
}
