import java.util.Arrays;
import java.util.Scanner;

public class SrtArr
{
    public int starr()
    {
        System.out.println("Enter the number of integers :");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers.");

        for (int i = 0; i < n; i++)
        {
            int no = scn.nextInt();
            numbers[i] = no;
        }

        Arrays.sort(numbers);
        System.out.println("The Sorted Array" + Arrays.toString(numbers));
        scn.close();
        return numbers[0];
    }
}
