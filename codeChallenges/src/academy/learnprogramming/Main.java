package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(3.1, 3.1);

    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {

        int firstInt = (int) (firstNum * 1000);
        int secondInt = (int) (secondNum * 1000);
        if ( firstInt == secondInt ) {
            return true;
        }
        return false;
    }

}

meet w developers

api endpoint documentation
mockiqtio
integratuion
