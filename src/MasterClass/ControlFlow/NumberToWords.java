package MasterClass.ControlFlow;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(8);
        System.out.println();
        numberToWords(10_000);
        System.out.println();
        numberToWords(358);
    }

    public static void numberToWords(int number) {
        int reversedNr = reverse(number);
        int var = 0;
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            while (true) {
                var = reversedNr % 10;
                reversedNr = reversedNr / 10;

                switch (var) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }

                if (reversedNr == 0) {
                    break;
                }

                var *= 10;
            }
            if (getDigitCount(number) > getDigitCount(reverse(number))) {
                int variable = getDigitCount(number) - getDigitCount(reverse(number));
                for (int i = 0; i < variable; i++) {
                    System.out.println("Zero");
                }
            }
        }


    }

    public static int reverse(int nr) {
        int val = 0;
        if (nr == 0) {
            return 0;
        }
        if (nr > -10 && nr < 10) {
            return nr;
        }
        while (true) {
            val += nr % 10;
            nr = nr / 10;
            if (nr == 0) {
                break;
            }
            val *= 10;
        }
        return val;
    }


    public static int getDigitCount(int nr) {
        int count = 0;
        int val = 0;
        if (nr < 0) {
            return -1;
        }
        if (nr < 10) {
            count++;
            return count;
        }
        while (true) {
            val = nr % 10;
            nr = nr / 10;
            count++;
            if (nr == 0) {
                break;
            }
        }
        return count;
    }
}
