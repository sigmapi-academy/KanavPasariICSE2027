package NestedLoops;
import java.util.*;

/**
 * Write a description of class Q13b_A here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q13b_A
{
    public static void main(String args[]){
        //print the series with sum
        //1 + (1 + 2) + (1 + 2 + 3) + ...+(1+2+3+...+n)
        int n, i, s = 0, t = 0, j;
        System.out.print("\f");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();
        for(i = 1; i <= n; i++){
            t +=i;
            s += t;
            System.out.print("(");
            for(j = 1; j < i; j++){
                System.out.print(j + " + ");
            }
            
            if(i < n){
                System.out.print(j + ") + ");    
            }
            else{
                System.out.print(j + ") = "+s);
            }
            
        }
    }
}
