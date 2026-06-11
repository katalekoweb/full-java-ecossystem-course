class Vars 
{
    public static void main (String a[])
    {
        // int num1 = 3; // = is assignment
        // int num2 = 5;
        // int result = num1 + num2;
        // System.out.println(result);

        // Data types

        // Primitive
        /**
         * Integer      -> byte, short, int, long
         * Float        -> double, float
         * Character
         * Boolean
         */

        /**
         * int      -> 4 bytes
         * long     -> 8 bytes
         * short    -> 2 bytes
         * byte     -> 1 byte -> -128 to 128
         */

        /**
         * float    -> 4 bytes
         * double   -> 8 bytes
         */

        /**
         * char     -> 2 bytes - only one char -> char c = 'k'
         */

        int num1 = 9;
        byte by = 127;
        short sh = 558;
        long l = 5854l; // its necessary to put l at the end

        float f = 5.8f; // its necessary to put f at the end
        double d = 5.8;

        char c = 'k'; // with single quotes

        boolean b = true;

        // literals
        int num2 = 0b101;
        int num3 = 10_000_000;
        double num4 = 12e10;
        char char1 = 'a';
        char1++;
        System.out.println(char1);

    }
}