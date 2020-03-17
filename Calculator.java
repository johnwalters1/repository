import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int selection;
        double op1, op2;
        Scanner keyboard = new Scanner(System.in);
        
//requests and takes operands 1 and 2
        System.out.print("Enter first operand: ");
        op1 = keyboard.nextDouble();
        System.out.print("Git test line")
        System.out.print("Enter second operand: ");
        op2 = keyboard.nextDouble();

//displays and takes selections
        System.out.print("Calculator Menu\n---------------\n1. Addition\n2. Subtraction");
        System.out.print("\n3. Multiplication\n4. Division\nWhich operation do you want to perform? ");
        selection = keyboard.nextInt();

        //math
        double answer = 0;
        if (selection == 1) {
            answer = (op1 + op2);
        } else if (selection == 2) {
            answer = (op1 - op2);
        } else if (selection == 3) {
            answer = (op1 * op2);
        } else if (selection == 4) {
            answer = (op1 / op2);
        }
        //checks for invalid selections, displays calculated answer if not
        if (selection < 1) {
            System.out.print("Error: Invalid selection! Terminating program.");
        } else if (selection > 4) {
            System.out.print("Error: Invalid selection! Terminating program.");
        } else {
            System.out.print("The result of the operation is " + (answer) + ". Goodbye!");
        }
    }
}
