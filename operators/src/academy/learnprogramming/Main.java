package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // operator = +
        // operand  = what it's working on.
        // you know all the operators
        int result = 1000;
        result/=4;
        System.out.println(result);
        // all of the operators you've grown and loved.

        boolean isAlien = false;

        // conditionals!!
        // note the lack of semi-colon after the parentheses
        // more about white-space later
//        if (isAlien == false)
        if (!isAlien) {
            System.out.println("It's not an alien");
            System.out.println("And I'm scared");
        }

        int topScore = 100;
//        if (topScore) {
//            System.out.println("you got a high score");
//        }

        // what is bitwise?
        // &&
        // ||

        // ternary operator
        // (condition to test) ? (value to use if true) : (value if false)
        // you can use it to assign one of
        boolean boolDonkey = true;
        int donkeyValue = boolDonkey ? (int) (45) : (int) (54);
        System.out.println(donkeyValue);

        double myDoubleVariable1 = 20.00d;
        double myDoubleVariable2 = 80.00d;
        double myEquation = (myDoubleVariable1 + myDoubleVariable2) * 100.00d;
        double myRemainder = myEquation % 40.00d;
        boolean myBoolean = (myRemainder==0) ? true : false;
        System.out.println("let's see... " + myRemainder + " " + myBoolean);
        if (myRemainder!=0.0) {
            System.out.println("Got some remainder");
        }

    }
}
