package MasterClass.HelloWorld.ControlFlow;

public class HasSameLastDigit {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }


    public static boolean hasSameLastDigit(int var1, int var2, int var3) {
        if (isValid(var1) && (isValid(var2)) && (isValid(var3))) {
            if (var1 % 10 == var2 % 10 || var2 % 10 == var3 % 10 || var3 % 10 == var1 % 10) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int nr) {
        if (nr < 10 || nr > 1000) {
            return false;
        }
        return true;
    }
}
