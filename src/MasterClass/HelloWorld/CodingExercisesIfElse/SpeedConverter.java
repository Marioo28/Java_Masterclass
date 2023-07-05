package MasterClass.HelloWorld.CodingExercisesIfElse;

public class SpeedConverter {

    public static void main(String[] args) {
//        System.out.println(toMilesPerHour(95.75));
        printConversion(95.75);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
//            double newMilesPerHour = kilometersPerHour * 0.6213711922;
            double newMilesPerHour = Math.round(kilometersPerHour / 1.609);
            long milesPerHour = (long) newMilesPerHour;

            return Math.round(milesPerHour);

    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
