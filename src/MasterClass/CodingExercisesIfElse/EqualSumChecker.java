package MasterClass.CodingExercisesIfElse;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,2));
    }

    public static boolean hasEqualSum( int a, int b, int c){
        int var = 0;
        var = a + b;
        if (var == c){
            return true;
        }else {
            return false;
        }
    }
}
