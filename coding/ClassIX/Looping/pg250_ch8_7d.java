package Looping;

/**
 * Write a description of class Q here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

/**

 * Write a description of class CopyOfpg250_ch8_7d here.

 *

 * @author (your name)

 * @version (a version number or a date)

 */

public class pg250_ch8_7d
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("\f");
        int n=20;
        int start;
        double sum = 0;
        for(start= 1; start < n-1; start++)
        {
            sum += start/(double)(start+1);
            System.out.print(start+"/"+(start+1)+" + ");
        } 
        sum += start/(double)(start+1);
        System.out.print(start+"/"+(start+1)+" = "+String.format("%.2f",sum));
    }

}
