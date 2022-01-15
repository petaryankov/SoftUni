package day6NestedConditionalStatements;

import java.util.Scanner;

public class P8OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examTineInHours = Integer.parseInt(scanner.nextLine());
        int examTimeInMinutes = Integer.parseInt(scanner.nextLine());
        int arrivingTimeInHours = Integer.parseInt(scanner.nextLine());
        int arrivingTimeInMinutes = Integer.parseInt(scanner.nextLine());

        int hours = 0;
        int minutes = 0;

        // time in seconds
        int examTotalTime = (examTineInHours * 60) + examTimeInMinutes;
        int arrivingTotalTime = (arrivingTimeInHours * 60) + arrivingTimeInMinutes;

        // late
        if (arrivingTotalTime > examTotalTime) {
            System.out.println("Late");
            //late + minutes
            minutes = arrivingTotalTime - examTotalTime;
            if (minutes < 60) {
                System.out.println(minutes + " minutes after the start");
                // late + hours
            } else if (minutes >= 60) {
                hours = minutes / 60;
                minutes %= 60;
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            }
            // on time and early
        } else if (arrivingTotalTime <= examTotalTime) {
            minutes = examTotalTime - arrivingTotalTime;
            //on time
            if (minutes == 0) {
                System.out.println("On time");
                //on time + second line
            } else if (minutes <= 30) {
                System.out.println("On time\n" + minutes + " minutes before the start");
                // Early + minutes
            } else if (minutes < 60) {
                System.out.printf("Early\n%d minutes before the start", minutes);
                //Early + hours
            } else {
                hours = minutes / 60;
                minutes %= 60;
                System.out.printf("Early\n%d:%02d hours before the start", hours, minutes);
            }

        }
    }
}
