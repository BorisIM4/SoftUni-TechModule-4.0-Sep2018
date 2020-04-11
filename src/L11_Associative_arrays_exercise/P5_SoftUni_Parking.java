package L11_Associative_arrays_exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P5_SoftUni_Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String > licensPlateMap = new LinkedHashMap<>();

        int numberOfEmploy = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfEmploy; i++) {
            String input = scanner.nextLine();
            String validation = input.split("\\s+")[0];
            if (validation.equals("register")){
                String employName = input.split("\\s+")[1];
                String employLicensPlate = input.split("\\s+")[2];

                if (licensPlateMap.containsKey(employName)){
                    System.out.println(String.format("ERROR: already registered with plate number %s" ,employLicensPlate));
                } else {
                    licensPlateMap.put(employName, employLicensPlate);
                    System.out.println(String.format("%s registered %s successfully" ,employName ,employLicensPlate));
                }
            } else {
                String employName = input.split("\\s+")[1];

                if (!licensPlateMap.containsKey(employName)){
                    System.out.println(String.format("ERROR: user %s not found" ,employName));
                } else {
                    licensPlateMap.remove(employName);
                    System.out.println(String.format("%s unregistered successfully" ,employName));
                }
            }
        }

        String pattern = "%s => %s";
        for (Map.Entry<String, String> kvp : licensPlateMap.entrySet()) {
            System.out.println(String.format(pattern, kvp.getKey(), kvp.getValue()));
        }
    }
}
