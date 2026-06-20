package Looping;
import java.util.*;

/**
 * Write a description of class Pg250Q19 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pg250Q19
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("\fPress 1 to check a number for Prime or not");
        System.out.print("\nPress 2 to chaeck a number is Automorphic or not");
        System.out.print("\nEnter your choice: ");
        int ch = sc.nextInt();

        if(ch == 1){
            System.out.print("Enter a no.:");
            int n=sc.nextInt();
            int cnt=0;
            //PRIME
            for(int i=1; i<=n; i++)
            {
                if(n%i==0)
                    cnt++;
            }
            if(cnt==2)
                System.out.print("\nPrime");
            else
                System.out.print("\nNot Prime");

        }
        else if (ch == 2){
            int i, sq, cnt = 0;
            System.out.print("Enter a no.:");
            int x=sc.nextInt();
            sq=x*x;
            //AUTOMORPHIC
            for(i=x; i>0; i/=10)
                cnt++;
            int g = sq % (int) Math.pow(10,cnt);
            if(g==x)
                System.out.print("\nAutomorphic");
            else
                System.out.print("\nNot Automorphic");    
        }
        else{
            System.out.print("\nWrong option selected.");
        }
    }
}