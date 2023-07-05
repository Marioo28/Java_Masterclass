package MasterClass.ControlFlow;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(3));
        System.out.println(getEvenDigitSum(4));
    }


    public static int getEvenDigitSum(int number) {
        int lastDigit = 0;
        int sum = 0;
        if (number < 0) {
            return -1;
        } else if (number < 9 && number % 2 == 0) {
            return number;
        }


        while (true) {
            lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            number /= 10;
            if (number == 0) {
                break;
            }
        }
        return sum;
    }
}
