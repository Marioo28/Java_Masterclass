package MasterClass.HelloWorld.ControlFlow;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-1234));
        System.out.println(sumDigits(9));
    }

    public static int sumDigits(int nr){
        int sum = 0;
        if (nr<0) {
            return -1;
        }

        while (true) {

            sum += nr % 10;
            nr = nr / 10;
            if (nr == 0){
                break;
            }
        }
        return sum;
    }
}
