package MasterClass.ControlFlow;

public class SwitchChallenge2 {
    public static void main(String[] args) {
        printDayOfWeek(8);
        printWeekDay(8);
    }

    public static void printDayOfWeek(int day){
        switch(day){
            case 0 -> System.out.println("The day " + day + " is Sunday");
            case 1 -> System.out.println("The day " + day + " is Monday");
            case 2 -> System.out.println("The day " + day + " is Tuesday");
            case 3 -> System.out.println("The day " + day + " is Wednesday");
            case 4 -> System.out.println("The day " + day + " is Thursday");
            case 5 -> System.out.println("The day " + day + " is Friday");
            case 6 -> System.out.println("The day " + day + " is Saturday");
            default -> System.out.println("Invalid Day");
        }
    }

    public static void printWeekDay(int day){
        if (day == 0){
            System.out.println("The day " + day + " is Sunday");
        }else if (day==1){
            System.out.println("The day " + day + " is Monday");
        }else if (day==2){
            System.out.println("The day " + day + " is Tuesday");
        }else if (day==3){
            System.out.println("The day " + day + " is Wednesday");
        }else if (day==4){
            System.out.println("The day " + day + " is Thurstday");
        }else if (day==5){
            System.out.println("The day " + day + " is Friday");
        }else if (day==6){
            System.out.println("The day " + day + " is Saturday");
        }else {
            System.out.println("Invalid day");
        }
    }
}
