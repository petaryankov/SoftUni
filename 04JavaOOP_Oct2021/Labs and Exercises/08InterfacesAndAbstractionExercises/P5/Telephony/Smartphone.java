package day8.InterfacesAndAbstractionExercises.P5.Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        for (String url : this.urls) {
            if (isUrlCorrect(url)) {
                sb.append("Browsing: ").append(url).append(System.lineSeparator());
            } else {
                sb.append("Invalid URL!").append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    private boolean isUrlCorrect(String url) {
        boolean isUrlCorrect = true;
        for (int index = 0; index < url.length(); index++) {
            if (Character.isDigit(url.charAt(index))) {
                isUrlCorrect = false;
            }
        }
        return isUrlCorrect;
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        for (String number : this.numbers) {
            if (isNumberCorrect(number)) {
                sb.append("Calling... ").append(number).append(System.lineSeparator());
            } else {
                sb.append("Invalid number!").append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    private boolean isNumberCorrect(String number) {
        boolean isNumberCorrect = true;
        for (int index = 0; index < number.length(); index++) {
            if (!Character.isDigit(number.charAt(index))) {
                isNumberCorrect = false;
            }
        }
        return isNumberCorrect;
    }
}
