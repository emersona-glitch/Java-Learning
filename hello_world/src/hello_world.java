public class hello_world {
//    keywords are case sensitive
    // the 'public' keyword is an access modifier, that we use to have the
    // fullest access here.
    // the 'class' keyword defines a class (being named to the right,
    // i.e. 'hello_world' here), with the block of code
    // within the curly braces being the class body


    // a method is a set of statements that dictate and perform an operation

    // declaring the method as public, as above
    // static --- ?
    // void -> return void, i.e. nothing
    // () are needed for a method declaration
    // one or more parameters are included -- (a string and some args).
    // {} -- code block is contained within...
    public static void main(String[] args) {
        // this is a complete statement to be executed as the requisite
        // code block for the method.
        System.out.println("Hello World :)");

        // we can declare variables using a
        // keyword (also indicating it's datatype)
        // and giving it a value (in the form of an expression)

        int myFirstNumber = 5*9%40;
        String bobsFavorite = "macaroni";

        System.out.println(bobsFavorite + " " +  myFirstNumber);


    }
}
