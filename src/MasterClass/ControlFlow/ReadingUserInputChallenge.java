package MasterClass.ControlFlow;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        readInput();

    }
    public static void readInput() {
        int count = 1;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);


        while (count <= 5) {

            System.out.println("Enter number #" + count + ":");
            try {
                String nr = scanner.nextLine();
               double nr1 = Double.parseDouble(nr);
                count++;
                sum += nr1;
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number!!!");
            }
        }
        System.out.println(sum);
    }
}
