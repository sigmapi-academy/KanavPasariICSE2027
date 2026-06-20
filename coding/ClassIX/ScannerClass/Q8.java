package ScannerClass;
import java.util.*;

/**
 * Write a description of class Q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q8
{
    public static void main(String[] args){
        System.out.print("\f");
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter how many numbers? ");
        int howManyNum = sc.nextInt();
        String posNum = "";
        String negNum = "";

        while(howManyNum > 1){
            System.out.print("Enter any integer value: ");
            int value = sc.nextInt();
            if( value < 0){
                //String concatenation (joining of two string values to 
                // create a new string)
                negNum += value + ", "; 
            }
            else{
                posNum += value + ", ";
            }
            howManyNum--;
        }
        
        System.out.print("Enter any integer value: ");
        int value = sc.nextInt();
        if( value < 0){
            negNum += value;
        }
        else{
            posNum += value;
        }
        
        System.out.print("\n" + negNum + posNum);
    }
}