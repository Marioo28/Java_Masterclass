package MasterClass.HelloWorld.CodingExercisesIfElse.IfElseChallenge;

public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int leverCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver == true) {
            finalScore += (leverCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        score = 10000;
        leverCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver) {
            finalScore += (leverCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

        }
        int scores = 1500;
        int position = calculateHighScorePosition(scores);
        displayHighScorePosition("Tim", position);





    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the hight score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int result = 0;
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

}
