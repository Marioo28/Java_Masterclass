package MasterClass.ControlFlow;

public class NumberOfDaysInMount {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(9000));


        System.out.println(getDaysInMounth(1,2020));
        System.out.println(getDaysInMounth(2, 2025));
        System.out.println(getDaysInMounth(11, 2020));

    }


    public static boolean isLeapYear(int year) {
        boolean result = false;
        if (year <1 || year > 9999) {
            result = false;
        } else if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {
            result = true;
        }
        return result;
    }

    public static int getDaysInMounth(int mounth, int year) {
        if (mounth < 1 || mounth > 12) {
            return -1;
        }
        if (year < 1 || year > 9999) {
            return -1;
        }

        int resultFinal = -1;
        switch (mounth) {
            case 1:
                resultFinal = 31;
                break;
            case 2:
                if (isLeapYear(year)) {
                    resultFinal = 29;
                }else {
                    resultFinal = 28;
                }
                break;
            case 3:
                resultFinal = 31;
                break;
            case 4:
                resultFinal = 30;
                break;
            case 5:
                resultFinal = 31;
                break;
            case 6:
                resultFinal = 30;
                break;
            case 7:
                resultFinal = 31;
                break;
            case 8:
                resultFinal = 31;
                break;
            case 9:
                resultFinal = 30;
                break;
            case 10:
                resultFinal = 31;
                break;
            case 11:
                resultFinal = 30;
                break;
            case 12:
                resultFinal = 31;
                break;


        }return resultFinal;
    }
}
