package MasterClass.HelloWorld.ControlFlow;

public class PrintFactors {
    public static void main(String[] args) {
        printFactors(6);
        printFactors(28);
        printFactors(30);
    }


    public static void printFactors(int nr) {
        if (nr < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i<=nr; i++){
                if (nr % i == 0){
                    System.out.println(i);
                }
            }
        }
    }
}
