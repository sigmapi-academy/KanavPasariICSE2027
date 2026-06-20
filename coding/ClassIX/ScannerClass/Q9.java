package ScannerClass;
import java.util.*;


/**
 * Write a description of class Q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q9
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter the upper bound: ");
        int N = sc.nextInt();
        
        //school 
        System.out.print("\n"+((int)(Math.random() * N)+1));
    }
}