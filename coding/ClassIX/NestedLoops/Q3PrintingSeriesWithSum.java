package NestedLoops;
import java.util.*;


/**
 * Write a description of class Q3PrintingSeriesWithSum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q3PrintingSeriesWithSum
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter number of terms: ");
        int n = sc. nextInt();
        int i, j;
        double sum = 0, Numer, Deno;
        for(i = 1; i <= n; i++){
            Numer = 0; 
            System.out.print("(");
            for(j = 1; j <= i; j++){
                System.out.print(j+" + ");
                Numer += j;
            }
            Numer += j;
            System.out.print(j+")/(");
            Deno = 1;
            for(j = 1; j <= i; j++){
                System.out.print(j+" * ");
                Deno *= j;
            }
            Deno *= j;
            sum += (Numer / Deno);
            if(i < n){
                System.out.print(j+") + ");    
            }
            else{
                System.out.print(j+") = " + sum);    
            }
        }
    }
}