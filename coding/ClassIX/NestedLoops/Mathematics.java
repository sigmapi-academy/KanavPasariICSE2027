package NestedLoops;
import java.util.*;
import MethodsInJava.Overloading.Arithmetic;

/**
 * Write a description of class Mathematics here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mathematics
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x, y, r;
        float f1, f2, fr;
        double d1, d2, dr;
        System.out.print("\fEnter two int values: ");
        x = sc.nextInt();
        y = sc.nextInt();
        r = Arithmetic.add(x, y);
        System.out.print("\nresult = " + r);
        System.out.print("\nEnter one int value and one float value: ");
        x = sc.nextInt();
        f1 = sc.nextFloat();
        fr = Arithmetic.add(x, f1);
        System.out.print("\nresult = " + fr);
        System.out.print("\nEnter two float values: ");
        f1 = sc.nextFloat();
        f2 = sc.nextFloat();
        fr = Arithmetic.add(f1, f2);
        System.out.print("\nresult = " + fr);
        
    }
}