package L11_Associative_arrays_exercise;

import java.util.*;

public class P6_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        Map<String, List<String>> coursesMap = new LinkedHashMap<>();

        while (!"end".equalsIgnoreCase(input = scanner.nextLine())) {
            String[] line = input.split(" : ");
            String courseName = line[0];
            String studentName = line[1];

            coursesMap.putIfAbsent(courseName, new ArrayList<>());
            List<String> students = coursesMap.get(courseName);
            students.add(studentName);
            Collections.sort(students);

        }

        coursesMap.entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()))
                .forEach(entry -> {
                    System.out.println(String.format("%s: %d", entry.getKey(), entry.getValue().size()));
                    entry.getValue().forEach(e -> System.out.println("-- " + e));
                });
    }
}
