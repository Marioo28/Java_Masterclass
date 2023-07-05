package MasterClass.HelloWorld.CodingExercisesIfElse;

public class ConvertToCentimeters {

    public static void main(String[] args) {
        System.out.println("Convert to cm1: " + convertToCentimeters(68));
        System.out.println("Convert to cm2: " + convertToCentimeters(5, 8));

    }

    public static double convertToCentimeters(int heightInInches) {
//        double result = heightInInches * 2.54;
        return heightInInches * 2.54;

    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
//        int feetToInch = heightInFeet * 12;
//        int totalInch = feetToInch + heightInInches;
//        return convertToCentimeters(totalInch);
        return convertToCentimeters((heightInFeet * 12) + heightInInches);

    }

}
