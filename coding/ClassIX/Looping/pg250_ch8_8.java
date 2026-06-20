package Looping;

/**
 * Write a description of class Q here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

/**

 * Write a description of class pg250_ch8_8 here.

 *

 * @author (your name)

 * @version (a version number or a date)

 */

public class pg250_ch8_8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("\fEnter a no.: ");
        int n=sc.nextInt();
        int rev=0, diff=0, t = n;
        for(; t>0; t = t / 10 )
        {
            rev=(rev*10)+t%10;
        }    
        System.out.print("\nThe reversed no. is: "+rev);
        diff=rev-n;
        System.out.print("\nThe absolute diff. is: "+Math.abs(diff));
    }

}