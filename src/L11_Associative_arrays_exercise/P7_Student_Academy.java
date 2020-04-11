package L11_Associative_arrays_exercise;

import java.util.*;

public class P7_Student_Academy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentDiary = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            double studentGrade = Double.parseDouble(scanner.nextLine());

            studentDiary.putIfAbsent(studentName,new ArrayList<>());
            studentDiary.get(studentName).add(studentGrade);

        }

        Map<String, Double> studentFinalGradesDiary = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> kvp : studentDiary.entrySet()) {
            String currentName = kvp.getKey();
            List<Double> currentGrades = kvp.getValue();

            if (currentGrades.size() <= 1){
                studentFinalGradesDiary.put(currentName,
                        currentGrades.get(0));
                continue;
            }

            double sumOfGrades = 0.0;
            for (int i = 0; i < currentGrades.size(); i++) {
                double currentGrade = currentGrades.get(i);
                sumOfGrades += currentGrade;
            }
            double averigeGrade = sumOfGrades / currentGrades.size();

            studentFinalGradesDiary.put(currentName, averigeGrade);
        }

        studentFinalGradesDiary.entrySet().stream()
                .filter(kvp -> kvp.getValue() >= 4.5)
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
        .forEach(kvp -> System.out.println(String.format("%s -> %.2f" ,kvp.getKey(), kvp.getValue())));
        System.out.println();
    }
}
