package TestDoubts;
import java.util.Scanner;

/**
 * Write a description of class Q12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q12
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fPress 1 for series "+
            "S=x^3/15 - x^6/11 + x^9/7 - x^12/3+...till 10 terms");
        System.out.print("\nPress 2 for Series S=2+5+10+17+26+37+... till T terms");
        System.out.print("\nEnter your choice(1 or 2): " );
        int ch = sc.nextInt();
        
        switch(ch){
            case 1:
                double S = 0, x, deno = 15;
                int i;
                System.out.print("\nEnter the value of x: ");
                x = sc.nextDouble();
                for(i = 1; i <= 10; i++){
                    S += Math.pow(x, i*3) / deno;
                    deno -= 4;
                }
                System.out.print("\nS = " + S);
                break;
            case 2:
                int T;
                System.out.print("\nEnter number of Terms: ");
                T = sc.nextInt();
                for(S=0, i = 1; i <= T; i++){
                    S += i*i+1;
                }
                System.out.print("\nS = " + S);
                break;
            default:
                System.out.print("\nWrong option selected.");
        }
    }
}