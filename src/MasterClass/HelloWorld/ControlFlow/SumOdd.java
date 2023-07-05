package MasterClass.HelloWorld.ControlFlow;

public class SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));

    }


    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }

        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int nr1, int nr2) {
        int sum = 0;
        if (nr1 > 0 && nr2 >= nr1) {
            for (int i = nr1; i <= nr2; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        } else if (nr2 == nr1) {
            return 0;
        } else {
            return -1;
        }

    }
}
