package Looping;
import java.util.Scanner;


/**
 * Write a description of class Pg253Q22a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pg253Q22a
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        int n, f;
        System.out.print("Enter any positive integer value: ");
        n = sc.nextInt();
        String output="";
        if(n > 0){
            for(f= 1; f <= n/2; f++){
                if(n % f == 0){
                    output+=f + ", ";
                }
            }
            System.out.print(output.substring(0,output.length()-2));
        }
        else{
            System.out.print("\nIncorrect input: Negative integer value.");
        }
    }
}