public class sectionFour {
    public static final double kilometers = 1.609344;
    public static int counter = 1;

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

        calculateScore2(gameOver, score, lvlCompleted, bonus, counter);

        score = 10000;
        lvlCompleted = 8;
        bonus = 200;

        calculateScore2(gameOver, score, lvlCompleted, bonus, counter);
        calculateScore2(true, 15000,10, 300, counter);
    }

    public static void calculateScore2(boolean gameOver, int score, int lvl, int bonus, int counter) {
        if (gameOver) {
            int finalScore = score + (lvl * bonus);
            finalScore += 1000;
            System.out.println("Final score " + counter + " is: " + finalScore);
            sectionFour.counter++;
        }
    }
}
