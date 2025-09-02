import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number:");
        int number = scanner.nextInt();

        System.out.println("Enter the power:");
        int power = scanner.nextInt();

        ToPower tpwr=new ToPower();
        int rst=tpwr.multiply(number,power);

        System.out.println("The result is :"+ rst );

    }
}