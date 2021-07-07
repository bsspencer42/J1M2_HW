public class PrimitiveOperations {
    public static void main(String[] args) {
        // Declare and Initialize int/double vars
        int myInt = 3;
        double myDouble = 5.75;
        System.out.println(myInt);
        System.out.println(myDouble);

        // Multiply and assign to new var
        double myResult = myInt * myDouble;
        System.out.println(myResult);

        // Cast int to double
        double myCastFloat = (double) myInt;
        System.out.println(myCastFloat);

        // Cast double to int
        int myCastInt = (int) myDouble;
        System.out.println(myCastInt);

        // Declare and initialize char
        char myChar = 'H';
        System.out.println(myChar);

        // Convert to lowercase using num op
        char myLowerChar = (char) ((int) myChar + 32);
        System.out.println(myLowerChar);
    }
}
