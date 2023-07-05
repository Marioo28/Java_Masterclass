package MasterClass.HelloWorld.CodingExercisesIfElse;

public class SecondsAndMinutesChallange {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(125, 45));
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-1, 45));



    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "No Valid seconds.";
        }
        return getDurationString(seconds / 60, seconds % 60);

    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "No Valid Minutes.";
        }
        if (seconds < 0 || seconds > 59) {
            return "No Valid seconds.";
        }

        int calculHours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;
        return (calculHours + "h " + remainingMinutes + "m " + remainingSeconds + "s");
    }
}
