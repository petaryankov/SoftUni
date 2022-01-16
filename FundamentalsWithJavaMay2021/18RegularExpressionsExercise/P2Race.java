package day19RegularExpressionsExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P2Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(",\\s+");
        List<String> racersNames = Arrays.stream(names).collect(Collectors.toList());

        String input = scanner.nextLine();
        String regexNames = "[A-Za-z]+";
        String regexNumbers = "\\d";
        Pattern patternNames = Pattern.compile(regexNames);
        Pattern patternNumbers = Pattern.compile(regexNumbers);
        Map<String, Integer> racers = new LinkedHashMap<>();
        racersNames.forEach(name -> racers.put(name, 0));
        while (!input.equals("end of race")) {
            //всички букви
            Matcher matcherNames = patternNames.matcher(input);
            StringBuilder nameBuilder = new StringBuilder();
            while (matcherNames.find()) {
                nameBuilder.append(matcherNames.group());
            }// всички цифри
            Matcher matcherNumbers = patternNumbers.matcher(input);
            int distance = 0;
            while (matcherNumbers.find()) {
                distance += Integer.parseInt(matcherNumbers.group());
            }
            if (racers.containsKey(nameBuilder.toString())) {
                racers.put(nameBuilder.toString(), racers.get(nameBuilder.toString()) + distance);
            }
            input = scanner.nextLine();
        }
        List<String> firstThree = racers.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("1st place: " + firstThree.get(0));
        System.out.println("2nd place: " + firstThree.get(1));
        System.out.println("3rd place: " + firstThree.get(2));
    }
}
