import java.util.Scanner;

		public class Calculator {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // Ask user for two numbers
		        System.out.print("Enter first number: ");
		        int a = sc.nextInt();

		        System.out.print("Enter second number: ");
		        int b = sc.nextInt();

		        // Ask user for an operator
		        System.out.print("Enter an operator (+, -, *, /): ");
		        char op = sc.next().charAt(0);  // read first character of input

		        // Perform operation based on operator
		        switch(op) {
		            case '+':
		                System.out.println("Result: " + (a + b));
		                break;
		            case '-':
		                System.out.println("Result: " + (a - b));
		                break;
		            case '*':
		                System.out.println("Result: " + (a * b));
		                break;
		            case '/':
		                if (b != 0) {
		                    System.out.println("Result: " + (a / b));
		                } else {
		                    System.out.println("Cannot divide by zero!");
		                }
		                break;
		            default:
		                System.out.println("Invalid operator!");
		        }
		    }
		}
	


