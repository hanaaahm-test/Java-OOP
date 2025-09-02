public class toPwr implements Power
    //abstract
{
    @Override
    public double exec(double a , double b)
    {
        return Math.pow(a,b);
    }

}