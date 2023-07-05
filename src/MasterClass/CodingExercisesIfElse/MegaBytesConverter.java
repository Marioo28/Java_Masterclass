package MasterClass.CodingExercisesIfElse;

public class MegaBytesConverter {


    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(-1024);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        double resultMB = 0.0;
        int resultMBToInt = 0;
        double resultAproximat = 0.0;
        double resultKB = 0;
        int resultKBToInt = 0;

        if (kiloBytes<0){
            System.out.println("Invalid Value");
        }else{

            resultMB = kiloBytes / 1024.0;
            resultMBToInt = (int) resultMB;
            resultAproximat = Math.floor(resultMB);
            resultKB = (resultMB-resultAproximat)*1024;
            resultKBToInt = (int) resultKB;
            System.out.println(kiloBytes + " KB = " + resultMBToInt + " MB and " + resultKBToInt + " KB");

        }

    }
}
