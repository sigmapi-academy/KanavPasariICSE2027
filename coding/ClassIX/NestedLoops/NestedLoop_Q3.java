package NestedLoops;
import java.util.*;


/**
 * Write a description of class NestedLoop_Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NestedLoop_Q3
{
    public static void main(String[] args){
        System.out.print("\f");
        Scanner sc = new Scanner(System.in);
        int n, nsum, pdeno, p, q;
        double frac, sum = 0;
        
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();
        
        for(p = 1; p <= n; p++){
            nsum = 0; pdeno = 1;
            for(q = 1; q <= (p+1); q++){
                nsum += q;
                pdeno *= q;
            }
            frac = (double)nsum/pdeno;
            sum += frac;
        }
        System.out.print("\nS = " + sum);
    }
}