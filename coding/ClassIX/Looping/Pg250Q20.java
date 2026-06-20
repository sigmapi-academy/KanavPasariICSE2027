package Looping;
import java.util.*;


/**
 * Write a description of class Pg250Q20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pg250Q20
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\fPress 1 for series 0, 3, 8, 15, 24, ...");
        System.out.print("\nPress 2 for series 1/2 + 3/4 + 5/6 + 7/8 + ... + 19/20");
        System.out.print("\nEnter your choice: ");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                System.out.print("\nEnter number of terms: ");
                int n=sc.nextInt();
                int start=1;
                for(;start<n;start++)
                {
                    System.out.print((start*start)-1+", ");
                }
                System.out.print(((start*start)-1));
                break;
            case 2:
                double sum = 0;
                int i;
                for(i = 1; i < 18; i+=2){
                    System.out.print(i + "/" + (i+1) + " + ");
                    sum += (double)i/(i+1);
                }
                sum += (double)i/(i+1);
                System.out.print(i + "/" + (i+1) + " = " + String.format("%.2f",sum));
                break;
            default:
                System.out.print("\nWrong option selected!");
        }
    }
}
