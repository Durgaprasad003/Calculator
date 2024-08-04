import java.util.Scanner;

public class Calculatorproject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your numbers to perform calculations\n");
        
        System.out.print("Enter your first value: ");
        Double num1 = input.nextDouble();
        
        System.out.print("Choose an operator (+, -, *, /, %): ");
        String operator = input.next();
        
        System.out.print("Enter your second value: ");
        Double num2 = input.nextDouble();
        
        Double result = null;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                System.out.println("You entered an invalid operator. Please enter a valid operator.");
                break;
        }

        if (result != null) {
            System.out.println("The result is: " + result);
        }

        input.close();
    }
}
