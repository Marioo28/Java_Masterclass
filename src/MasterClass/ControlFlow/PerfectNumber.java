package MasterClass.ControlFlow;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-3));


    }

    public static boolean isPerfectNumber(int nr) {
        int sum = 0;
        if (nr < 1) {
            return false;
        }

        for (int i = 1; i < nr; i++) {
            if (nr % i == 0) {
                sum += i;
            }
        }
        if (sum == nr){
            return true;
        }
        return false;
    }
}
