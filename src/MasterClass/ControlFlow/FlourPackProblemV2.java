package MasterClass.ControlFlow;

public class FlourPackProblemV2 {
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
        // Here we are checking if the inputs are valid
        if (bigCount < 0 || smallCount < 0 || goal < 0 || (bigCount*5 + smallCount)  < goal) {
            return false;
        }

        // Here we multiply bigCount with 5 since each bigCount contains 5 kg
        int bigCountKilo = bigCount * 5;

        // We check if goal > 5 and then subtract bigCount from it till the goal is less than 5kg
        while (goal >= 5) {
            if (bigCountKilo > 0) {
                goal -= 5;
                bigCount-=1;
            } else {
                break;
            }
        }

        // Similarly here too we are checking if goal is greater than 0 and then subtracting smallCount values
        while (goal > 0) {
            if (smallCount > 0) {
                goal -= 1;
                smallCount -= 1;
            } else {
                break;
            }
        }

        // We are returning true if goal is reached (if goal becomes zero)
        return (goal == 0);
    }
}
