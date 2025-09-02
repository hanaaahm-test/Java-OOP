import java.util.Scanner;

public class ToPower
{
  static int add ( int x , int y)
  {
      return x + y;
  }
  static int multiply(int x, int y)
  {
      int result=0;
      for(int i=0 ; i<y ; i++)
      {
        result=add(result,x);
      }
      return result;
  }
}
