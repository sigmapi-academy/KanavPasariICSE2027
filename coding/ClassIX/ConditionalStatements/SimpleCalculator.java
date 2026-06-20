package ConditionalStatements;
import java.util.*;


/**
 * Write a description of class SwitchDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimpleCalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x, y, r;
        char oper;
        System.out.print("\fPress operator symbols to select your operation: ");
        System.out.print("\n+,-,*,/,%");
        System.out.print("\nEnter your operator: ");
        oper = sc.next().charAt(0);
        
        switch(oper){
            case '+':
                System.out.print("\nEnter first number: ");
                x = sc.nextInt();
                System.out.print("\nEnter second number: ");
                y = sc.nextInt();
                r = x + y;
                System.out.print("\nSum = " + r);
                break;
            case '-':
                System.out.print("\nEnter first number: ");
                x = sc.nextInt();
                System.out.print("\nEnter second number: ");
                y = sc.nextInt();
                r = x - y;
                System.out.print("\nDifference = " + r);
                break;
            case '*':
                System.out.print("\nEnter first number: ");
                x = sc.nextInt();
                System.out.print("\nEnter second number: ");
                y = sc.nextInt();
                r = x * y;
                System.out.print("\nProduct = " + r);
                break;
            case '/':
                System.out.print("\nEnter first number: ");
                x = sc.nextInt();
                System.out.print("\nEnter second number: ");
                y = sc.nextInt();
                if(y == 0){
                    System.out.print("\nDivisor can't be zero.");
                    break; //it will break the switch
                }
                r = x / y;
                System.out.print("\nQuotent = " + r);
                break;
            case '%':
                System.out.print("\nEnter first number: ");
                x = sc.nextInt();
                System.out.print("\nEnter second number: ");
                y = sc.nextInt();
                if(y == 0){
                    System.out.print("\nDivisor can't be zero.");
                    break; //it will break the switch
                }
                r = x % y;
                System.out.print("\nRemainder = " + r);
                break;
            default:
                System.out.print("\nWrong operator selected.");
        }
    }
}