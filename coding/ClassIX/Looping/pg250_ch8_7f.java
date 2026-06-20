package Looping;


import java.util.*;

/**

 * Write a description of class CopyOfpg250_ch8_7d here.

 *

 * @author (your name)

 * @version (a version number or a date)

 */

public class pg250_ch8_7f
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("\f");
        int n=20;
        int start, sum = 0;
        for(start= 1; start < n-1; start++)
        {
            sum += start*(start+1);
            System.out.print("("+start+"*"+(start+1)+") + ");
        } 
        sum += start*(start+1);
        System.out.print("("+start+"*"+(start+1)+") = "+sum);
    }

}
