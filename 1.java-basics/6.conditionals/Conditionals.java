class Conditionals
{
    public static void main (String args[])
    {
        int x = 8;
        int y = 7;
        int z = 9;

        // if (x>y && x>z) 
        //     System.out.println(x);
        // else if (y>x && y>z)
        //     System.out.println(y);
        // else
        //     System.out.println(z);

        // if (x>y) 
        // {
        //     System.out.println(x);
        //     System.out.println("Thank you!");
        // }
        // else
        //     System.out.println(y);

        // if (x>10 && x<=20) // 11 - 20
        //     System.out.println("Hello");
        // else
        //     System.out.println("Bye bye!");

        // ternary operator
        int n = 4;
        int result = 0;

        // if (n%2==0)
        //     result = 10;
        // else 
        //     result = 20;

        result = n%2 == 0 ? 10 : 20;
        // System.out.println(result);

        // switch case statement
        int num = 1;

        switch(num) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid number");  
        };
        
    }
}