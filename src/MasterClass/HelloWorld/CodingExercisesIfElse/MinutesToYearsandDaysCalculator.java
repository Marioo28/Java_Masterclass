package MasterClass.HelloWorld.CodingExercisesIfElse;

public class MinutesToYearsandDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);

    }


    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;

            long remainingdays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remainingdays + " d");
        }
    }
}
