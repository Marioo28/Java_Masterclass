package MasterClass.CodingExercisesIfElse;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        a = (int) (a * 1000);
        b = (int) (b * 1000);

        if (a == b) {
            return true;
        }else {
            return false;
        }
    }
}
