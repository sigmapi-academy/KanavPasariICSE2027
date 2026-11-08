package BoxingAndUnBoxing;


/**
 * Write a description of class IntegerMaxMinDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IntegerMaxMinDemo
{
    public static void main(String[] args){
        int a = 75;
        int b = 75;
        
        System.out.print("\fFirst Number: " + a);
        System.out.print("\nSecond Number: " + b);
        
        System.out.print("\nMaximum: " + Integer.max(a, b));
        System.out.print("\nMinimum: " + Integer.min(a, b));
        System.out.print("\nMaximum: " + Integer.max(a, 35));
        System.out.print("\nMinimum: " + Integer.min(a, 35));
    }
}