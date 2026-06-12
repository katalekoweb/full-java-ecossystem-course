class Types {
    public static void main (String args[]) {
        byte b = 127;
        int a = 257;

        // b = a;
        // a = b; // conversion
        b = (byte)a; // casting -> explicit conversion

        // System.out.println(b);

        float f = 5.6f;
        int x = (int)f; // you'll lose the decimals

        System.out.println(x);

        // Type promotion
        byte be = 10;
        byte ba = 30;

        int result = be * ba; // type promotion -> the value will be bigger than byte max
        System.out.println(result);
    }
}