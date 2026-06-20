package Sem1ClassIX;
import java.util.*;


/**
 * Write a description of class Q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q6
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        int num, n, i, sum = 0, cp = 0, cn = 0;
        System.out.print("\nEnter number of values you have: ");
        n = sc.nextInt();
        for(i = 1; i <= n; i++){
            System.out.print("Enter any number: ");
            num = sc.nextInt();
            if(num >= 0){
                cp++;
                sum += num;
            }
            else{
                cn++;
            }
        }
        System.out.print("\nNumber of positive values: " + cp);
        System.out.print("\nSum of positve values: " + sum);
        System.out.print("\nNumber of negative values: " + cn);
    }
}