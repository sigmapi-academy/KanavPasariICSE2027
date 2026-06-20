package Looping;

/**
 * Write a description of class Q here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class pg250_ch8_17
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("\fEnter a no.: ");
        int n=sc.nextInt();
        int p=1, t = n, d;
        for(; t>0; t = t / 10, p++ )
        {
            d = t % 10;
            System.out.print("\n" + d + "^"+p +" = " + ((int)Math.pow(d, p)));
        }
    }

}
