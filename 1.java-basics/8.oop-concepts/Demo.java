class Demo
{
    public static void main (String args[]) {
        int num1 = 4, num2 = 5; // primitives

        Calculator calculator = new Calculator(); // reference vars
        int result = calculator.add(num1, num2);

        // int result = num1 + num2;
        System.out.println(result);
    }
}

class Calculator {
    int a;
    public int add (int n1, int n2) {
        int r = n1+n2;
        return r;
    }
}

// Object Oriented Programmin
// Object - Properties and behaviors
// we need classes to implement OOP
// JDK - used to compile the java code that is converted to byte code