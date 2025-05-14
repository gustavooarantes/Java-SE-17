package javacourse2;

public class Conditionals {
    public static void main(String[] args) {
        // Use case of a simple if-then case (no use of else cases) - not a particularly good practice
        boolean isValid = false;
        if (!isValid)
            System.out.println("It is false");

        // Ternary operator
        isValid = true;
        String myText = isValid ? "This if true" : "This if false";
    }
}
