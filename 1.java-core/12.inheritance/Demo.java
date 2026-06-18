public class Demo {
    public static void main(String[] args) {
        VeryAdvCalc calc = new VeryAdvCalc();
        int r1 = calc.multi(10, 15);
        int r2 = calc.sub(17, 10);
        int r3 = calc.multi(5, 3);
        int r4 = calc.div(10, 2);
        double r5 = calc.power(100, 2);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);

        // muliple inheritance in Java will not work
        // to avoid ambiguity
    }
}

