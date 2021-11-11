public class sectionFour {
    public static final double kilometers = 1.609344;
    public static int counter = 1;

    public static void main(){
        int newScore = calculateScoreOverload("Ali", 200);
        System.out.println("New score is " + newScore);
        calculateScoreOverload(75);
        calculateScoreOverload();
    }

    public static void keywordsAndExpressions() {
        double oneHundredMilesToKilometers = 100 * kilometers;
        int highScore = 50;

        if (highScore == 50) {
            System.out.println("This is an expression, 100m to km = " + oneHundredMilesToKilometers);
        }

        int score = 100;
        if (score > 99) {
            System.out.println("You got the high score!");
            score = 0;
        }
    }

    public static void statementsWhitespaceAndIndentation() {
        int myVar = 50;
        myVar++;
        myVar--;

        System.out.println("Test, myVar = " + myVar);
    }

    public static void codeBlocks() {
        System.out.println("--------------------------------------");

        boolean gameOver = true;
        int score = 5000;
        int lvlCompleted = 5;
        int bonus = 100;

        if (score == 5000)
            System.out.println("Your score: 5000");

        if (gameOver) {
            System.out.println("Your final score: " + calculateScore(score, lvlCompleted, bonus));
        }

        System.out.println("--------------------------------------");

        score = 10000;
        lvlCompleted = 8;
        bonus = 200;

        System.out.println("Your score: " + score);

        if (gameOver) {
            System.out.println("Your final score: " + calculateScore(score, lvlCompleted, bonus));
        }

        System.out.println("--------------------------------------");
    }

    public static int calculateScore(int score, int lvl, int bonus) {
        int finalScore = score + (lvl * bonus);
        finalScore += 1000;
        return finalScore;
    }

    public static void methods() {
        boolean gameOver = true;
        int score = 800;
        int lvlCompleted = 5;
        int bonus = 100;

        System.out.println("Final score " + counter + " is: " + (calculateScore2(gameOver, score, lvlCompleted, bonus, counter)));

        score = 10000;
        lvlCompleted = 8;
        bonus = 200;

        System.out.println("Final score " + counter + " is: " + (calculateScore2(gameOver, score, lvlCompleted, bonus, counter)));
        System.out.println("Final score " + counter + " is: " + (calculateScore2(true, 15000,10, 300, counter)));
    }

    public static int calculateScore2(boolean gameOver, int score, int lvl, int bonus, int counter) {
        if (gameOver) {
            int finalScore = score + (lvl * bonus);
            finalScore += 1000;
            sectionFour.counter++;
            return finalScore;
        }
        return -1;
    }

    public static void highScoreChallenge(){
        String player1 = "Ali", player2 = "James", player3 = "Phil", player4 = "Ben";
        int score1 = 1000, score2 = 900, score3 = 400, score4 = 50;
        int positionPlayer1 = calculateHighScorePosition(score1), positionPlayer2 = calculateHighScorePosition(score2), positionPlayer3 = calculateHighScorePosition(score3), positionPlayer4 = calculateHighScorePosition(score4);

        displayHighScorePostition(player1, positionPlayer1);
        displayHighScorePostition(player2, positionPlayer2);
        displayHighScorePostition(player3, positionPlayer3);
        displayHighScorePostition(player4, positionPlayer4);


    }

    public static void displayHighScorePostition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        } else if (score >= 500){
            return 2;
        } else if (score >= 100){
            return 3;
        }
        return 4;
    }

    public static int calculateScoreOverload(String name, int score){
        System.out.println("Player " + name + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScoreOverload(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScoreOverload(){
        System.out.println("No player name or player score");
        return 0;
    }
}
