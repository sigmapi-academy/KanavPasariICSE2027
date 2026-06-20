package Looping;
import java.util.*;


/**
 * Write a description of class Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q7
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x, sum = 1;
        int i, f = 1, n;
        System.out.print("\fEnter the value of 'x': ");
        x = sc.nextDouble();
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();
        for(i = 1; i <= n; i++, f *= i){
            sum += Math.pow(x, (i+1))/f;
        }
        System.out.print("\nSum = " + sum);
    }
}