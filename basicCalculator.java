//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//import java.io.*;
import java.lang.*;
//import java.lang.Math;
import java.util.Scanner;

public class basicCalculator {
    public static void main(String[] args) {
        //store two numbers
        double num1 = 0, num2 = 0;
        boolean validInput = false;

        //let's take input from the user
        Scanner sc = new Scanner(System.in);

        //while validInput is not false (true)
        while (!validInput) {
            //try block contains code that might throw an exception
            try {
                System.out.println("Enter the first number: ");
                num1 = Double.parseDouble(sc.nextLine()); // read input and convert to double

                System.out.println("Enter the second number: ");
                num2 = Double.parseDouble(sc.nextLine()); // read input and convert to double

                validInput = true; // If parsing is successful, exit the loop

                //catches and handles the exception thrown by the 'try'
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid numbers."); // Handle invalid input
            }
        }


        System.out.println("Enter the operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        double o = 0;

        switch (op) {
            //case to add 2 numbers
            case '+':
                o = num1 + num2;
                break;
            //case to subtract 2 numbers
            case '-':
                o = num1 - num2;
                break;
            //case to multiply 2 numbers
            case '*':
                o = num1 * num2;
                break;
            //case to divide 2 numbers
            case '/':
                o = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
            }
        System.out.println("The final result:");
        System.out.println();

        //print final result
        System.out.println(num1 + " " + op + " " + num2 + " = " + o);
    }
}

