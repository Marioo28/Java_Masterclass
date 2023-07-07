package MasterClass.ControlFlow;

public class FlourPackProblemV1 {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-2, 2, 11));
        System.out.println(canPack(4, 18, 19));
        System.out.println(canPack(5, 3, 24));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigCountKilo = bigCount * 5;
        int smallCountInKilo = smallCount;

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else {

            if (bigCountKilo + smallCountInKilo == goal) {
                return true;
            } else if ((bigCountKilo >= goal && bigCountKilo % goal == 0) || (bigCountKilo >= goal && goal % 5 <= smallCount)) {
                return true;
            } else if (smallCount >= goal) {
                return true;
            } else if (bigCountKilo + smallCount > goal && goal % bigCountKilo <= smallCount) {
                return true;
            } else {
                return false;
            }
        }
    }
}
