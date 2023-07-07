package MasterClass.ControlFlow;

import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double minNr = Integer.MAX_VALUE;
        double maxNr = Integer.MIN_VALUE;
        double counter = 0;

        while (true) {
            System.out.println("Please enter a number or a character to quit");
            String var = scanner.nextLine();
            try {
                double nr = Double.parseDouble(var);
                if (counter == nr) {
                    break;
                }
                counter = nr;
                if (nr < minNr) {
                    minNr = nr;
                    counter = nr;
                }
                if (nr > maxNr) {
                    maxNr = nr;
                    counter = nr;
                }


            } catch (NumberFormatException e) {
                System.out.println("Character entered! ");
                break;
            }
        }

        System.out.println("Min nr: " + minNr);
        System.out.println("Max nr: " + maxNr);
    }
}
