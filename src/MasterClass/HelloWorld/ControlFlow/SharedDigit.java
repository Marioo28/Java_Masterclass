package MasterClass.HelloWorld.ControlFlow;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(99,9));
        System.out.println(hasSharedDigit(15,55));
        System.out.println(hasSharedDigit(44,14));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        int fistDigitNr1 = 0;
        int secondDigitNr1 = 0;
        int fistDigitNr2 = 0;
        int secondDigitNr2 = 0;

        if (number1 <10 || number1>99) {
            return false;
        }
        if (number2<10 || number2 > 99 ) {
            return false;
        }

        while (true) {
            fistDigitNr1 = number1 % 10;
            number1 /= 10;
            secondDigitNr1 = number1 % 10;
            number1 /= 10;
            fistDigitNr2 = number2 % 10;
            number2 /= 10;
            secondDigitNr2 = number2 % 10;
            number2 /= 10;

            if (number1 == 0) {
                break;
            }
        }
        return fistDigitNr1 == fistDigitNr2 || fistDigitNr1 == secondDigitNr2 ||
                secondDigitNr1 == fistDigitNr2 || secondDigitNr1 == secondDigitNr2;
    }
}
