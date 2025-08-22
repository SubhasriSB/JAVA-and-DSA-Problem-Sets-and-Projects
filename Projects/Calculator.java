import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Take input from user till user does not press X or x
        int ans = 0;
        while (true) {
//Take the operator as input
            try {
                System.out.println("Enter the Operator (+, -, *, /, %, x to exit): ");
                char op = sc.next().trim().charAt(0);

                if (op == 'x' || op == 'X') {
                    System.out.println("Exiting Calculator... Goodbye!");
                    break;
                }
                //            System.out.println(": ");
                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                    System.out.println("Enter the two numbers: ");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    switch (op) {
                        case '+':
                            ans = num1 + num2;
                            break;
                        case '-':
                            ans = num1 - num2;
                            break;
                        case '*':
                            ans = num1 * num2;
                            break;
                        case '/':
                            if (num2 == 0) {
                                throw new ArithmeticException("Division by zero is not allowed!");
                            }
                            ans = num1 / num2;
                            break;
                        case '%':
                            ans = num1 % num2;
                            break;
                        default:
                            //                        System.out.println("Oops! Invalid Operator!");
                            break;
                    }
                    System.out.println("Output: " + ans);
                } else {
                    System.out.println("Invalid Operator");
                }
            }catch (InputMismatchException e) {
                System.out.println("Invalid number input! Please enter integers only.");
                sc.nextLine(); // clear buffer
            }
            catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
            catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
            sc.close();
        }
    }
