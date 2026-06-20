package Looping;
import java.util.*;


/**
 * Write a description of class Pg252Q18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pg252Q18
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1,n2, res, ch, q;
        System.out.print("\fEnter first number: ");
        n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        n2 = sc.nextInt();
        System.out.print("\nPress 1 to display the sum of two numbers");
        System.out.print("\nPress 2 to display the product of two numbers");
        System.out.print("\nPress 3 to display the quotient and remainder");
        System.out.print("\nEnter your choice(1-3): ");
        ch = sc.nextInt();
        switch(ch){
            case 1:
                res = n1 - (-n2);
                System.out.print("\nSum = " + res);
                break;
            case 2:
                res = (int)(n1/(1.0/n2));
                System.out.print("\nProduct = " + res);
                break;
            case 3:
                //quotient and remainder without using '/' and '%'
                for(q = 0; n1 >= n2; n1-=n2, q++);
                System.out.print("\nQuotient: " + q);
                System.out.print("\nRemainder: " + n1);
                break;
            default:
                System.out.print("\nWrong option selected");
        }
    }
}