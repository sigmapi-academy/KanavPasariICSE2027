package ConditionalStatements;
import java.util.*;


/**
 * Document comment
 * Write a description of class TernaryOperator here.
 *
 * @author (Satyendra)
 * @version (a version number or a date)
 * 
 */
public class TernaryOperator
{
    /**
     * Here we are testing ternary operator.
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, r;
        System.out.print("\f");
        System.out.print("\nEnter the value of n1: ");
        n1 = sc.nextInt();
        System.out.print("\nEnter the value of n2: ");
        n2 = sc.nextInt();
        //Single line comment
        //r = (n1 > n2)? n1:n2;
        //System.out.print("\nr = " + r);
        /*
         * Multi-line comment
         * 
         * 
         * 
         * 
         */
        System.out.print("\nEnter the value of n3: ");
        n3 = sc.nextInt();
        
        r = (n1 > n2 && n1 > n3)? n1 : (n2 > n3)? n2:n3;
        System.out.print("\nr = " + r);
    }
}