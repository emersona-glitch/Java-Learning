package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Java has 52 reserved keywords!
        // that seems like so few!

        // variables, values, and operators
        // in the expression below
        double kilometres = (100 * 1.609344);
        // the variable name, the values, and the operators
        // are what make up the expression
        // NOT the data-type and the semicolon
        // adding these things make it a valid STATEMENT

        // the evaluated portion of a control-flow statement
        // (like an if-then condition
        // would also be an expression.

        // a method call is also a statement,
        // such as an sout

        // whitespace is dealt with the same
        // i.e. 1 space is the same as 50 spaces

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        if (score == 5000) {
            System.out.println("Your score was 5000");
        }

        // because this conditional only has one statement
        // or line of code to execute in its code-block,
        // the above line of code can be converted to:

        if (score == 5000)
            System.out.println("Your score was 5000");

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }




        // Pink kiwi man says use curly braces anyway, though
        // If-elseif-else statements work the same as JS

        // scope works the same too.

        calculateScore(false, 800, levelCompleted, bonus);


        displayHighScorePosition("Emerson", calculateHighScorePosition(1000));

    }

    // let's talk methods!
    // our main() is a method, here's a new one
    // called calculateScore()

    // when you're declaring a method,
    // you tell it which parameters it takes, and which datatypes they are.
    // it needs to receive all of them when called in order to avoid an error
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        System.out.println("testing our donkey out");
        System.out.println("If gameOver = " + gameOver + " then we're gonna do some stuff");

    }

    // we can execute this by calling it in our main, like on line 58

    // the return of a method (where we have 'void' above)
    // every method needs some return. If you say void, that takes care of it
    // if you say "int", then you need to

    // similar to JS, when the return is hit, it breaks out of
    // the method you're in.

    // -1 indicates an error or (in the case of a search) an object
    // wasn't found.

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore>500 && playerScore<1000) {
            return 2;
        } else if (playerScore>100 && playerScore<500) {
            return 3;
        } else {
            return 4;
        }
    }

}
