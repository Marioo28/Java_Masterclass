package MasterClass.ControlFlow;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }


    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double counter = 0;
        int result= 0;

        while (true) {
            System.out.println("Enter a number, or a character to exit:");
            String input = scanner.nextLine();
            try {
                int nr = Integer.parseInt(input);
                sum += nr;
                counter++;
            } catch (NumberFormatException e) {
                break;
            }
        }
        try{
            System.out.println("SUM = " + sum + " AVG = " + Math.round(sum / counter));
        }catch (ArithmeticException e) {
            System.out.println("SUM = 0 AVG = 0");
        }

    }
}
