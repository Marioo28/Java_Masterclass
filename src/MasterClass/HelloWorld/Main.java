package MasterClass.HelloWorld;

public class Main {


    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum += i;
                count++;
                System.out.println("numarul divizibil si cu 3 si cu 5 este: " + i);
            }
            if (count == 5) {
                System.out.println("Suma primilor 5 numere este: " + sum);
                break;
            }

        }

            for (int i = 1; i <= 1000; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    sum += i;
                    count++;
                }
            }
        System.out.println("Suma primilor 5 numere este: " + sum);
    }

    }

