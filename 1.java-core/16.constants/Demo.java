public class Demo {
    public static void main(String[] args) {
        final int PIE = 8; // the value is imutable
        // num = 10;
        System.out.println(PIE);

        Calcul calc = new Calcul();
        calc.show();
        calc.add(10, 15);
    }
}

final class Calcul
{
    public void show () 
    {
 
    }

    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}

// class AdvCalc extends Calcul // error
// {

// }
