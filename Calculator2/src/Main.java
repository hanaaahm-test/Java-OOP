import java.util.Scanner;

import static java.lang.System.err;

public class Main {
    public static void main(String[] args) {
        Basic_Calc myCalc= new Basic_Calc();
        Adva_Calc advCal=new Adva_Calc();
        Adv_Op sqr = new Adv_Op.squar();
        Adv_Op sqroot = new Adv_Op.SquareRoot();
        Power tPwr= new toPwr();

        // create scanner to get data from user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        // Display welcome message for Calcuator program
        System.out.println("Hello in our calculator, " + name + "!");

        System.out.println("Please, Choose the operation u need to perform. " +
                "\n For Operations with one number, Press 1"+
                "\n For Operations with two numbers , Press 2");
        String userOper = scanner.nextLine();

        switch (userOper) {
            case ("1"):
                System.out.println("What operation do u need to perform ? \n For Square Press q " +
                        "\n For Square root press r ");
                String userOper2 = scanner.nextLine();
                System.out.println("Please enter your number: ");
                double sqrnum1 = Double.parseDouble(scanner.nextLine());

                //Polymorphism
                switch (userOper2) {
                    case ("q"):
                        System.out.println("Square of number :" + sqrnum1 + " is " + sqr.execute(sqrnum1));
                        break;
                    case ("r"):
                        System.out.println("Square Root of number :" + sqrnum1 + " is " + sqroot.execute(sqrnum1));
                        break;
                    default:
                        System.out.println("Please choose the right operation.");
                }
                case ("2"):
                System.out.println("What operation do u need to perform ? \n For Addtion Press d " +
                        "\n For Substraction press s \n For multiplication press m \n For Division press v " +
                        "\n For Modulus press u \n For Percentage press g \n For To the Power of press w ");
                String userOper3 = scanner.nextLine();
                System.out.println("Please enter the first number: ");
                int num1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Please enter the second number: ");
                int num2 = Integer.parseInt(scanner.nextLine());

                switch (userOper3) {
                    //Encapsulation
                    case ("d"):
                        int addRst = myCalc.add(num1, num2);
                        System.out.println("The Addition Result= " + addRst);
                        break;
                    case ("s"):
                        int subRst = myCalc.subs(num1, num2);
                        System.out.println("The Substraction result= " + subRst);
                        break;
                    case ("m"):
                        int mulRst = myCalc.multiply(num1, num2);
                        System.out.println("The Multiplication Result= " + mulRst);
                        break;
                    case ("v"):
                        // Inheritance
                        try {
                            int divRst = advCal.division(num1, num2);
                            System.out.println("The Division Result= " + divRst);
                        } catch (Exception e) {
                            // Code to handle the exception
                            System.out.println(e.getMessage());
                        }

                        break;
                    case ("u"):
                        int modRst = advCal.mod(num1, num2);
                        System.out.println("The Modulus Result= " + modRst);
                        break;
                    case ("g"):

                        double perRst = advCal.percnt((double) num1, (double) num2);
                        System.out.println("The Percentage Result = " + perRst + "%");
                        break;
                    //Abstraction
                    case ("w"):
                        double toPwrRst = tPwr.exec((double) num1, (double) num2);
                        System.out.println(num1 + " To the power of " + num2 + " = " + toPwrRst);
                        break;
                    default:
                        System.out.println("No Such Operation Found.");
                }
                break;
            default:
                System.out.println(" Please Try Another Operation.");
        }
        System.out.println("Thank u for using our calculator (ENG.SALy)");
        scanner.close();
        }
    }




