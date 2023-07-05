package MasterClass.HelloWorld.ControlFlow;

public class SumFirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-1));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(11));
        System.out.println(sumFirstAndLastDigit(1222223));
    }

    public static int sumFirstAndLastDigit(int number) {
        int lastDigit = 0;
        int fistDigit = 0;
        if (number < 0) {
            return -1;
        } else if (number < 9) {
            if (number == 0) {
                return 0;
            }
            return number * 2;
        }
        lastDigit += number % 10;
        number /= 10;
        while (true) {
            fistDigit = number % 10;
            number /= 10;
            if (number == 0) {
                break;
            }
        }
        return lastDigit + fistDigit;
    }
}
