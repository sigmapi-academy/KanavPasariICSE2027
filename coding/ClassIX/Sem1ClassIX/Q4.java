package Sem1ClassIX;
import java.util.*;


/**
 * Write a description of class Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q4
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fPress 1 for series-1");
        System.out.print("\nPress 2 for series-2");
        System.out.print("\nEnter your choice(1 or 2): ");
        int ch = sc.nextInt();
        int n;
        switch(ch){
            case 1:
                System.out.print("\nEnter number of terms: ");
                n = sc.nextInt();
                int sum = 0;
                for(int i = 1; i <= n; i++){
                    sum += (i*2-1);
                }
                System.out.print("\nS = " + sum);
                break;
            case 2:
                double i = 1.5;
                for(; i < 12.0; i+=1.5){
                    System.out.print(i+", ");
                }
                System.out.print(i);
                break;
            default:
                System.out.print("\nWrong option selected.");
        }
    }
}