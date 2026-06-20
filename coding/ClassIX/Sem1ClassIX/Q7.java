package Sem1ClassIX;
import java.util.*;

/**
 * Write a description of class Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q7
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        char ch;
        int wt, cost = 0;
        System.out.print("\nPress 'O' for Ordinary");
        System.out.print("\nPress 'E' for Express");
        System.out.print("\n Choose ('O' or 'E'): ");
        ch = sc.next().charAt(0);
        switch(ch){
            case 'O': 
                System.out.print("\nEnter the Weight of the parcel: ");
                wt = sc.nextInt();

                if(wt <= 100){
                    cost = 80;
                }
                else if(wt <= 500){
                    cost = 150;
                }
                else if(wt <= 1000){
                    cost = 210;
                }
                else{
                    cost = 260;
                }
                break;
            case 'E':
                System.out.print("\nEnter the Weight of the parcel: ");
                wt = sc.nextInt();

                if(wt <= 100){
                    cost = 100;
                }
                else if(wt <= 500){
                    cost = 200;
                }
                else if(wt <= 1000){
                    cost = 250;
                }
                else{
                    cost = 300;
                }
                break;
            default:
                System.out.print("\nWrong Option Selected!");
                System.exit(0);
        }

        System.out.print("\nCharges: \u20b9" + cost);
    }
}