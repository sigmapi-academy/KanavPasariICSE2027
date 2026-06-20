package Sem1ClassIX;
import java.util.*;


/**
 * Write a description of class Q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q5
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int kms, fare = 120;
        System.out.print("\fEnter number of Kilometers travelled: ");
        kms = sc.nextInt();
        if(kms <= 15){
            fare += (kms-5)*15;
        }
        else if( kms <= 30){
            fare += 150 + (kms - 15)*12;
        }
        else{
            fare += 330 + (kms - 30) * 10;
        }
        System.out.print("\nFare: \u20b9" + fare);
    }
}