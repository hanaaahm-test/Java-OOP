import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your Original String:");
        String OriginalString = scn.nextLine();

        System.out.println("Enter your Replacement String:");
        String ReplacedString = scn.nextLine();

        System.out.println("Enter your Replacement Word:");
        String Replwrd = scn.nextLine();

        ReplacString rps=new ReplacString();
        String FinalString=rps.rpl(OriginalString,ReplacedString,Replwrd);

        System.out.println("The Final String is:"+FinalString);

    }
}