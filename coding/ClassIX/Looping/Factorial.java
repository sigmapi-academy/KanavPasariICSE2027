package Looping;
import java.util.*;


/**
 * Write a description of class Factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Factorial
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        int num;
        double f = 1;
        System.out.print("Enter any natural number: ");
        num = sc.nextInt();
        System.out.print(num + "! = ");
        while(num > 1){
            System.out.print(num + " * ");
            f = f * num;
            num--;
        }
        System.out.print(num + " = " + (long)(f));
    }
}
