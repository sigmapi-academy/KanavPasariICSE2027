package Looping;
import java.util.*;


/**
 * Write a description of class DemoOfWhileLoop here.
 * Wrting code to input a number, and we will find the sum of 
 * all the natural number upto that number.
 * For example:
 * Input:
 * Enter any number: 5
 * Output:
 * 1 + 2 + 3 + 4 + 5 = 15
 * @author (your name)
 * @version (a version number or a date)
 */
public class DemoOfWhileLoop
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        int num, start = 1, sum = 0;
        System.out.print("Enter any natural number: ");
        num = sc.nextInt();
        while(start < num){
            System.out.print(start + " + ");
            sum = sum + start;
            start++;
        }
        System.out.print(start+" = " + (sum + start));
    }
}
