package Looping.dowhileLoop;
import java.util.*;

/**
 * Write a description of class DoWhileExample1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoWhileExample1
{
    public static void main(String[] args){
        //multiplication table of a number entered by the user
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        int num, start = 1, end;
        do{
            System.out.print("Enter any number: ");
            num = sc.nextInt();   
            if(num <= 0){
                System.out.println("\nYou have entered -ve value, please enter +ve value");
            }
        }while(num <= 0);

        do{
            System.out.print("Enter number of terms: ");
            end = sc.nextInt();
            if(end <= 0){
                System.out.println("\nYou have entered -ve value, please enter +ve value");
            }
        }while(end <= 0);

        do{
            System.out.print("\n"+num + " * " + start + " = " + (num*start));
            start++;
        }while(start <=end);
    }
}