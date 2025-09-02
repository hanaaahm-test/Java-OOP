import java.util.Scanner;

public class PyramidUsingAstric {

           public static void main(String[] args) {

            System.out.println("Please enter the number of rows to build the pyramid:");
            Scanner scanner = new Scanner(System.in);
            int row = scanner.nextInt();
            scanner.close();

            System.out.println("Number of rows entered:"+ row);

            //int spaces= row+4 -1;
            for (int i=1; i<=row; i++) //Loop for rows row =3
            {
                for (int s=i; s<=row; s++)
                {
                    System.out.print("  ");
                }

                for(int j=1 ;j<= (2*i-1);j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
