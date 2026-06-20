package NestedLoops;
import java.util.*;

/**
 * Write a description of class NestedLoop_Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NestedLoop_Q1
{
    public static void main(String args[]){
        System.out.print("\f");
        int start = 5, end = 10, p, times = 15;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter the starting number: ");
        start = sc.nextInt();
        System.out.print("\nEnter the end number: ");
        end = sc.nextInt();
        System.out.print("\nEnter number of times: ");
        times = sc.nextInt();
        
        System.out.print("\nMultiplication table from "+start + 
            " to " + end + " for " + times + " times.");
        for(;start<=end; start++){
            for(p = 1; p <= times; p++){
                System.out.print("\n" + p +" * " + start + " = " + (p * start));
            }
            System.out.println("\n================");
        }
    }
}