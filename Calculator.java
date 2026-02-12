
// Program for making Calculator
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        float num1, num2, result = 0;
        char operator;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        num1 = sc.nextInt();
        System.out.println("Enter num2");
        num2 = sc.nextInt();
        System.out.println("Enter operation");
        operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(result);
                break;
            default:
                System.out.println("invalid!!!..");
                break;
        }

    }
}