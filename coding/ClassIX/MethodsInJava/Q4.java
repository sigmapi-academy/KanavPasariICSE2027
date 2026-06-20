package MethodsInJava;
import java.util.*;


/**
 * Write a description of class Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q4
{
    public int fact(int n){
        int f = 1;
        for(;n > 1; f *= n, n--);
        return f;
    }
    
    public static void main(String[] args){
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter any positive integer for n: ");
        n = sc.nextInt();
        if(n < 1){
            System.out.print("\nInvalid input: ");
            return; //exit from main() method
        }
        System.out.print("Enter any positive integer for m: ");
        m = sc.nextInt();
        if(m < 1 ){
            System.out.print("\nInvalid input: ");
            return; //exit from main() method
        }
        if((n - m) < 1){
            System.out.print("\nValue of " + n + " should be greater than "+m);
            return; //exit from main
        }
        Q4 ob = new Q4();
        int S = ob.fact(n)/(ob.fact(m) * ob.fact(n-m));
        System.out.print("\nS = " + S);
    }
}