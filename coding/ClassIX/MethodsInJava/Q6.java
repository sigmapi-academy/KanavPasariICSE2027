package MethodsInJava;
import java.util.*;


/**
 * Write a description of class Q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q6
{
    public int HCF(int x, int y){
        for(int r = 0; y > 0; r = x % y, x = y, y = r );
        return x;
    }
    
    public int LCM(int x, int y){
        return (x * y) / HCF(x, y);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.print("\fEnter the value of x: ");
        x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        y = sc.nextInt();
        Q6 ob = new Q6();
        System.out.print("\nLCM = " + ob.LCM(x,y));  
    }
}