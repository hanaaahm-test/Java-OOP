import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        basic_Calc myCalc  = new basic_Calc();
        advancedCalc advCal=new advancedCalc();
        basic_opCalc exOper = new basic_opCalc.Addition();
        basic_opCalc exOper2 =new basic_opCalc.Substraction();
        newCalcOper myOperations=new multiply();

        // create scanner to get data from user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        // Display welcome message for Calcuator program
        System.out.println("Hello in our calculator, " + name + "!");

        // Encapsulation methods
        //--------------------------------------------------------------------------
        //basic_Calc myCalc
        System.out.println("What operation do u need to perform ? \n For Addtion Press 1 " +
        "\n For Substraction press 2 \n For multiplication press 3 \n For Division press 4 " +
        " \n For SquareRoot Press 5 " +"\n For Modulus press 6 \n For Percentage press 7 ");

        String userOperation = scanner.nextLine();

        switch (userOperation) {

            // call addition method
            case ("1"):
                System.out.println("Please enter the first number: ");
                int addnum1=Integer.parseInt(scanner.nextLine());
                System.out.println("Please enter the second number: ");
                int addnum2=Integer.parseInt(scanner.nextLine());
                int addResult = myCalc.add(addnum1, addnum2);
                System.out.println("The addition result= " + addResult);
                break;
            // call substraction method
            case ("2"):
                System.out.println("Please enter the first number: ");
                int subnum1=Integer.parseInt(scanner.nextLine());
                System.out.println("Please enter the second number: ");
                int subnum2=Integer.parseInt(scanner.nextLine());
                int subResult = myCalc.subs(subnum1, subnum2);
                System.out.println("The substrac result= " + subResult);
                break;

            // call multiplication method
            case ("3"):
                System.out.println("Please enter the first number: ");
                int mulnum1=Integer.parseInt(scanner.nextLine());
                System.out.println("Please enter the second number: ");
                int mulnum2=Integer.parseInt(scanner.nextLine());
                int multiplyResult = myCalc.multiply(mulnum1, mulnum2);
                System.out.println("The multipy result= " + multiplyResult);
                break;

            // call division method
            case ("4"):
                try {
                    System.out.println("Please enter the first number: ");
                    int divnum1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please enter the second number: ");
                    int divnum2 = Integer.parseInt(scanner.nextLine());
                    int divResult = myCalc.division(divnum1, divnum2);
                    System.out.println("The division result= " + divResult);
                }
                catch (Exception e) {
                    // Code to handle the exception
                    System.out.println(e.getMessage());
                    System.out.println("Please enter the first number: ");
                    int divnum1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please enter the second number: ");
                    int divnum2 = Integer.parseInt(scanner.nextLine());
                    int divResult = myCalc.division(divnum1, divnum2);
                    System.out.println("The division result= " + divResult);
                }
                break;


        // Inheritance Methods
        //--------------------------------------------------------------------------
        //advancedCalc advCal
        // call square method
            case ("5"):
                System.out.println("Please your number: ");
                int sqrnum1=Integer.parseInt(scanner.nextLine());
                int sqrResult=advCal.sqr(sqrnum1);
                System.out.println("The square result= " + sqrResult);
                break;
        // call mod method
            case ("6"):
                System.out.println("Please enter the first number: ");
                int modnum1=Integer.parseInt(scanner.nextLine());
                System.out.println("Please enter the second number: ");
                int modnum2=Integer.parseInt(scanner.nextLine());
                int modResult=advCal.mod(modnum1,modnum2);
                System.out.println("The modlus result= " + modResult);
                break;
        // call percnt method
            case ("7"):
                System.out.println("Please enter the first number: ");
                int pernum1=Integer.parseInt(scanner.nextLine());
                System.out.println("Please enter the second number: ");
                int pernum2=Integer.parseInt(scanner.nextLine());
                double prcentResult=advCal.percnt(pernum1,pernum2);
                System.out.println("The percent result= " + prcentResult + " %");
                break;
            default:
                System.out.println("No Such Operation Found");
        }
         //call polymorphism methods
        //--------------------------------------------------------------------------
       // basic_opCalc exOper ,exper2
        System.out.println("Let's try Polymorphism or Abtraction methods \n To Execute Addtion Press 1 " +
                "\n To Execute Substraction press 2 \n To Try Abtract method For Multiplication press 3 " );
        String ExecuteOperation = scanner.nextLine();
        switch (ExecuteOperation) {

            // call addition method
            case ("1"):
                System.out.println("Please enter the first number: ");
                int exaddnum1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Please enter the second number: ");
                int exaddnum2 = Integer.parseInt(scanner.nextLine());
                System.out.println("Addition result: " + exOper.execute(exaddnum1, exaddnum2));
                break;
            case ("2"):
                System.out.println("Please enter the first number: ");
                int exsubnum1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Please enter the second number: ");
                int exsubnum2 = Integer.parseInt(scanner.nextLine());
                System.out.println("Subtraction result: " + exOper2.execute(exsubnum1, exsubnum2));
                break;


        //call abstract methods
        //--------------------------------------------------------------------------
        //newCalcOper myOperations
            case ("3"):
                System.out.println("Please enter the first number: ");
                int munum1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Please enter the second number: ");
                int munum2 = Integer.parseInt(scanner.nextLine());
                System.out.println("Multiplication result: " + myOperations.execute(munum1, munum2));
                break;
            default:
                System.out.println("No Such Execution Operation Found");
        }
        // Close the scanner
          scanner.close();
    }
}



