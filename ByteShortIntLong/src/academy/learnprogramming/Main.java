package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // ints have a range of
        int myValue = 10000;

        // employing a wrapper class, with keyword "Integer"
        // we can perform operations on an int
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        // adding or going beyond these values results in an
        // overflow or an underflow
        // byte has a range from -128 to 128
        // short
        byte myMaxByteValue = 20;
        long myLongValue = 100000000000000l;
        System.out.println(myLongValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        // this is casting, because you have to tell
        byte myNewByteValue = (byte) (myMinIntValue / 2);

        // it's best to use integers unless you have a reason not to
        // (self-describing coding, for instance)

        long myBigLongValue = (short) (50000l + 10l * (Byte.MAX_VALUE + Integer.MAX_VALUE + Short.MAX_VALUE));
        System.out.println(myBigLongValue);

        int myBigIntValue = Integer.MAX_VALUE;

        // floating point number datatypes are
        // float, and double, for double precision at 32 and 64 bytes
        // 'resolution
        float myBigFloatValue = Float.MAX_VALUE;
        System.out.println(myBigFloatValue);

        // it's good practice to include the f tag and d thing.
        // (what do you call these things...
        float myFloatValue = (float) 5.25;
        // it's preferable to do this:
        myFloatValue = 5.25f;
        System.out.println(myFloatValue);

        // this will not handle the remainder of the division
        int newIntValue = 5 / 2;
        // the following  will only work if you make sure to
        // cast both of these numbers as floats
        float newFloatValue = 5f / 2f;
        // or you can use decimal literals:
        double myDoubleValue = 5.00 / 3.00;

        double pounds = 57d;
        double kilograms = pounds * 0.45359237d;
        System.out.println(kilograms);
        // beware you can also write numbers like this:
        double dingusNumber = 3_000.4_123_2d;
        System.out.println(dingusNumber);
        // for BIG numbies with big precision,
        // you need BigDecimal

        // but on to chars and booleans babyyyyy
        // char only stores a SINGLE character,
        // so it's only useful for things that you wanna do that for...
        // char uses 2 bytes in memory
        char myFavoriteChar = 'Q';
        // character literals baby
        char myLittleUnicodeGuy = '\u0044';
        System.out.println(myLittleUnicodeGuy);
        // Boolean values are true and false like so:
        boolean myBooleanValue = true;





    }
}
