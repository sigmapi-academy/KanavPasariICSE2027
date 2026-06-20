package NestedLoops;
import java.util.*;


/**
 * Write a description of class NestedLoop_Q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NestedLoop_Q2
{
    public static void main(String[] args){
        System.out.print("\f");
        Scanner sc = new Scanner(System.in);
        String output="";
        int num, start = 1, end = 7, d, count;
        for(;start<=end; start++){
            System.out.print("Enter any number: ");
            num = sc.nextInt();
            //loop to detect num is prime or not
            for(count = 0, d = 1; d <= num; d++){
                if( num % d == 0 ){
                    count++;
                }
            }
            if(count == 2){
                //concatenation or joining of values one after other.
                output += num + " "; 
            }
        }
        
        System.out.print("\nPrime numbers are: " + output);
    }
}