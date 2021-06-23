import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		int number1, number2, result;
		char operator;
		Scanner input = new Scanner(System.in);
		System.out.println("********");
		System.out.println("Simple Calculator");
		System.out.println("********");
		System.out.println("Enter First Number:");
		number1 = input.nextInt();
		System.out.println("Enter Second Number:");
		number2 = input.nextInt();
		System.out.println("Select an operator(+,-,*,/):");
		operator = input.next().charAt(0);
		switch(operator){
			case '+':
				result = number1 + number2;
				System.out.println("Result: " + result);
				break;
			case '-':
				result = number1 - number2;
				System.out.println("Result: " + result);
				break;
			case '*':
				result = number1 * number2;
				System.out.println("Result: " + result);
				break;
			case '/':
				result = number1 / number2;
				System.out.println("Result: " + result);
				break;
			default:
				System.out.println("Enter a valid operator");
		}
	}
}