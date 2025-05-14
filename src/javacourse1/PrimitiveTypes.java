package javacourse1;

public class PrimitiveTypes {
    public static void main(String[] args) {
        // integers
        int number = 5;
        int minIntValue = Integer.MIN_VALUE; // provides the minimum possible value of an integer data type
        int maxIntValue = Integer.MAX_VALUE; // provides the maximum possible value of an integer data type

        // testing out MAX and MIN value methods of different wrapper classes
        System.out.println("Integer Minimum Value: " + minIntValue);
        System.out.println("Integer Maximum Value: " + maxIntValue);

        long longRange = Long.MAX_VALUE;
        System.out.println("Long Maximum Value: " + longRange);

        // showcase of a scenario where explicit casting a value to a certain data type avoids compiling error
        byte myMinByte = Byte.MIN_VALUE;
        byte myByte = (byte) (myMinByte / 2);
        System.out.println(myByte);

        long x = 11000L / 17;
        System.out.println(x);
    }
}
