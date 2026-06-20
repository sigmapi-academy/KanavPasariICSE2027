package Looping;

/**
 * Write a description of class Q here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pg250_ch8_7e
{
    public static void main(String args[])
    {
        System.out.print("\f");
        int i=0, sum=0, t=2, N = 20;
        for(i=1; i < N; i++)
        {
            if(i%2==0){
                sum-=t;
                System.out.print(t+"+");
            }
            else{
                sum+=t;
                System.out.print(t+"-");
            }
            t+=2;
        }
        if(i%2==0){
            sum-=t;
            System.out.print(t);
        }
        else{
            sum+=t;
            System.out.print(t);
        }
        System.out.print(" = "+sum);
    }
}