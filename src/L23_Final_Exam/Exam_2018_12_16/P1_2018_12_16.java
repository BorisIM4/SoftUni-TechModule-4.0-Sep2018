package L23_Final_Exam.Exam_2018_12_16;

import java.util.*;

public class P1_2018_12_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> bandsWithMembers = new LinkedHashMap<>();
        Map<String, Long> bandsWithPlayTime = new LinkedHashMap<>();
        long totalTime = 0;

        //tova e sykraten nachin
        //whlie(!(inputLine = scanner.nextLine()).equals("start of concert")){
        // }

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("start of concert")){
            String[] inputParametters = inputLine.split("\\;\\s+");

            String command = inputParametters[0];
            String bandName = inputParametters[1];

            if (command.equals("Add")){
                if (!bandsWithMembers.containsKey(bandName)){
                    bandsWithMembers.put(bandName, new ArrayList<>());
                }

                String[] bandMembers = inputParametters[2].split("\\,\\s");

                for (int i = 0; i < bandMembers.length; i++) {
                    if (!bandsWithMembers.get(bandName).contains(bandMembers[i])){
                        bandsWithMembers.get(bandName).add(bandMembers[i]);
                    }
                }
            } else if (command.equals("Play")){
                if (!bandsWithPlayTime.containsKey(bandName)){
                    bandsWithPlayTime.put(bandName, 0L);
                }

                int playTime = Integer.parseInt(inputParametters[2]);
                totalTime += playTime;
                long oldPLayTime = bandsWithPlayTime.get(bandName);
                bandsWithPlayTime.put(bandName, oldPLayTime + playTime);
            }

            inputLine = scanner.nextLine();
        }

        System.out.println(String.format("Total time: %d", totalTime));

        bandsWithPlayTime
                .entrySet()
                .stream()
                .sorted((e1,e2) -> {
                    if (e2.getValue() > e1.getValue()){
                        return 1;
                    } else if (e1.getValue() > e2.getValue()){
                        return -1;
                    } else {
                        return e1.getKey().compareToIgnoreCase(e2.getKey());
                    }
                })
        .forEach(band -> {
            System.out.println(String.format("%s -> %d",band.getKey(), band.getValue()));
                });

        String requestetBand = scanner.nextLine();

        System.out.println(requestetBand);
        bandsWithMembers
                .get(requestetBand)
                .forEach(member -> System.out.println("=> " + member));
    }
}
