package ScannerClass;
import java.util.*;


/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * 
 */
public class Q1
{
    public static void main(String[] args){
        float tempInF, tempInC;
        System.out.print("\f");
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("\nEnter temperature in Farenheit: ");
            tempInF = sc.nextFloat();
            tempInC = ((tempInF - 32)/9)*5;
            System.out.print("\nTemperature in Celcius: " + tempInC);
            System.out.print("\nEnter any non-numeric character to terminate: ");
            char c = sc.next().charAt(0);
            if(!Character.isDigit(c)){
                System.out.print("\nGood Bye");
                System.exit(0);
            }
        }while(true);
    }
}