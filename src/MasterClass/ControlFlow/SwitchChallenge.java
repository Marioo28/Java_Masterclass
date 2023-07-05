package MasterClass.ControlFlow;

public class SwitchChallenge {
    public static void main(String[] args) {
        System.out.println( getText('C'));
    }

    public static String getText(char x){
        switch (x){
            case 'A':
                return "Able";
            case 'B':
                return "Baker";
            case 'C':
                return "Charlie";
            case 'D':
                return "Dog";
            case 'E':
                return "Easy";
            default:
                return "No Code is Found";

        }
    }
}
