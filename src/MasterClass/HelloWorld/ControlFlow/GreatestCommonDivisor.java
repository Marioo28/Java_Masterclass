package MasterClass.HelloWorld.ControlFlow;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println( getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));

    }


    private static int getGreatestCommonDivisor(int first, int second) {
        int[] firstVars = new int[first];
        int[] secondVars = new int[second];
        int contor1 = 0;
        int contor2 = 0;
        int var = 0;
        if ((first < 10) || (second < 10)) {
            return -1;

        }
        for (int i = 1; i <= first; i++) {
            if (first % i == 0) {
                firstVars[contor1] = i;
                contor1++;
            }
        }
        for (int i = 1; i <= second; i++) {
            if (second % i == 0) {
                secondVars[contor2] = i;
                contor2++;
            }
        }

        for (int i = 0; i < firstVars.length; i++) {
            for (int j = 0; j < secondVars.length; j++) {
                if (firstVars[i] == secondVars[j]){
                    if (firstVars[i] > var){
                        var = firstVars[i];
                    }
                }
            }
        }

        return var;

//        for (int n : firstVars) {
//            System.out.println(n);
//        }
//
//        System.out.println("------------------");
//
//        for (int n : secondVars) {
//            System.out.println(n);
//        }
    }
}
