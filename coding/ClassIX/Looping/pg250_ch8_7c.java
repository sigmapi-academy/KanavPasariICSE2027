package Looping;


/**
 * Write a description of class Q here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pg250_ch8_7c
{
    public static void main(String args[])
    {
        System.out.print("\f");
        double i=0, sum=0, q;
        for(i=1; i<20; i++)
        {
            if(i%2==1)
            {
                q= 1.0/i;
                sum+=q;
                System.out.print("1/"+(int)i+" + ");   
            }
        }     
        q=1.0/i;
        sum+=q;
        System.out.print("1/"+(int)i+" = "+String.format("%.2f",sum));
    }
}