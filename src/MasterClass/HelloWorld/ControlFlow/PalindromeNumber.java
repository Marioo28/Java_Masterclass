package MasterClass.HelloWorld.ControlFlow;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(100012));
        System.out.println(isPalindrome(10001));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(-707));

    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int testNr = number;
        while (true) {
            reverse += number % 10;
            number /= 10;
            if (number == 0) {
                break;
            }
            reverse *= 10;
        }

        if (testNr == reverse){
            return true;
        }
        return false;
    }
}

