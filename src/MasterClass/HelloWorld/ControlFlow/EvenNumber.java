package MasterClass.HelloWorld.ControlFlow;

public class EvenNumber {
    public static void main(String[] args) {
        for (int i = 5; i <= 20; i++) {
            if (isEvenNumber(i)) {
                System.out.println(i);
            }
        }


        int evenNumbers = 0;
        int oddNumbers = 0;
        int i = 5;
        while (i <= 20) {
            if (isEvenNumber(i)) {
                evenNumbers++;
                System.out.println(i);
            }else {
                oddNumbers++;
            }
            i++;
        }
        System.out.println("Total even found: " + evenNumbers);
        System.out.println("Total odd found: " + oddNumbers);
    }

    public static boolean isEvenNumber(int nr) {
        if (nr % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


}


