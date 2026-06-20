package ConditionalStatements;
import java.util.Scanner;


/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q1
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b, c, sum;
        System.out.print("\fEnter first angle: ");
        a = sc.nextInt();
        System.out.print("Enter second angle: ");
        b = sc.nextInt();
        System.out.print("Enter third angle: ");
        c = sc.nextInt();
        
        sum = a + b + c;
        if(a == 0 || b == 0 || c == 0 || sum != 180){
            System.out.print("\nConstruction of trianle is not possible.");
        }
        else{
            //construction of triangle is possible
            if(a < 90 && b < 90 && c < 90){
                System.out.print("\nAcute-angle triangle");
            }
            else if( a > 90 || b > 90 || c > 90){
                System.out.print("\nObtuse-angle triangle");
            }
            else{
                System.out.print("\nRight-angle triangle");
            }
        }
    }
}  