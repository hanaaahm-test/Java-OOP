public class Basic_Calc {
    // encapsulation
    public int add(int a, int b)
    {
        return a + b;
    }
    public int subs(int a , int b)
    {
        return a - b;
    }
    public int multiply(int a , int b)
    {
        return a * b;
    }
    public int division(int a, int b)
    {
            if ( b == 0)
                {
                  throw new ArithmeticException("Cannot divide by 0 please try again ");

                }
        return a / b ;

    }
}
