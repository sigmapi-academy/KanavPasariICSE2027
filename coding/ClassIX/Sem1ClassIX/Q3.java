package Sem1ClassIX;
import java.util.*;

/**
 * Write a description of class Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q3
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f Press 1 for Buzz number");
        System.out.print("\n Press 2 for Abundant number");
        System.out.print("\nEnter your choice(1 or 2): ");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                System.out.print("\nEnter any number: ");
                int n = sc.nextInt();
                if(n % 10 == 7 || n % 7 == 0){
                    System.out.print("\nNumber is Buzz");
                }
                else{
                    System.out.print("\nNumber is not Buzz");
                }
                break;
            case 2:
                System.out.print("\nEnter any number: ");
                n = sc.nextInt();
                int d, sum = 0;
                for(d = 1; d <= n/2; d++){
                    if(n % d == 0){
                        sum += d;
                    }
                }
                if (sum > n){
                    System.out.print("\nAbundant Number");
                }
                else{
                    System.out.print("\nNot an Abundant Number");
                }
                break;
            default:
                System.out.print("\nWrong Option Selected!");
        }
    }
}
