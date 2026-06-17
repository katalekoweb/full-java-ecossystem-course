class Operators 
{
    public static void main (String args[]) {
        int num1 = 7;
        int num2 = 5;

        // int result = num1+num2;
        // int result = num1-num2;
        // int result = num1+num2;
        // double result = num1/num2;
        int result = num1%num2;

        // incremeting
        // num1 = num1 + 1;
        // num1 += 1; // num1 *= 2; num1 /= 2; num1 -= 2;
        // num1++; // post - increment
        ++num1; // pre - increment

        int num3 = ++num1; // the value is incremented
        int num4 = num1++; // the value is not incremented in new variable

        // decremeting
        // num1--;
        
        System.out.println(num1);
    }
}