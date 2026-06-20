package NestedLoops;
import java.util.*;


/**
 * Write a description of class Q13b here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q13b
{
    public static void main(String args[]){
        //1 + (1 + 2) + (1 + 2 + 3) + ...+(1+2+3+...+n)
        int n, i, s = 0, t = 0;
        System.out.print("\f");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();
        for(i = 1; i <= n; i++){
            t +=i;
            s += t;
        }
        System.out.print("\nS = " + s);
    }
}