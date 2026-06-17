class Loops
{
    public static void main (String args[])
    {
        // types of loops
        // while, do while, for

        int i = 5;

        // while loop
        // while (i<=4) {
        //     System.out.println("Hi " + i);
        //     i++;
        // }

        // do while loop
        // do {
        //     System.out.println("Hi " + i);
        //     i++;
        // } while (i<=4);

        // for loop
        // initialization, condition and incrementing

        for (int j = 1; j<=7; j++) {
            System.out.println("Day " + j);

            for (int k = 1; k<=9; k++) {
                System.out.println("    " + (k+8) + " - " + (k+9));
            }
        }
        
    }
}