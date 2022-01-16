package day19RegularExpressionsExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P4StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //count all the letters [s, t, a, r] – case insensitive
        int numMessages = Integer.parseInt(scanner.nextLine());
       List<String> attacked = new ArrayList<>();
       List<String> destroyed = new ArrayList<>();
        for (int i = 1; i <= numMessages; i++) {
            String message = scanner.nextLine();
            String regexStar = "[STARstar]";
            Pattern patternStar = Pattern.compile(regexStar);
            Matcher matcherStar = patternStar.matcher(message);
            StringBuilder sb = new StringBuilder();
            while (matcherStar.find()) {
                sb.append(matcherStar.group());
            }
            StringBuilder modifiedMessage = new StringBuilder();
            for (int j = 0; j < message.length(); j++) {
                int subtract = sb.length();
                char symbol = (char) (message.charAt(j) - subtract);
                modifiedMessage.append(symbol);
            }
            String regex = "@(?<planetName>[A-Za-z]+)[^@\\-!:>]*:\\d+[^@\\-!:>]*!(?<attack>[AD])![^@\\-!:>]*->\\d+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(modifiedMessage);
            if(matcher.find()) {
                String aOrD = matcher.group("attack");
                if (aOrD.equals("A")) {
                   attacked.add(matcher.group("planetName"));
                } else {
                    destroyed.add(matcher.group("planetName"));
                }

            }
        }
        System.out.println("Attacked planets: " + attacked.size());
        attacked.stream().sorted().forEach(planet -> System.out.println("-> " + planet));
        System.out.println("Destroyed planets: " + destroyed.size());
        destroyed.stream().sorted().forEach(planet -> System.out.println("-> " + planet));

        //planet name -> planet population -> attack type -> soldier count
    }
}
