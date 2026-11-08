package BoxingAndUnBoxing;


/**
 * Write a description of class IntegerCompareDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IntegerCompareDemo
{
    public static void main(String[] args){
        int a = 100;
        int b = 200;
        
        int result = Integer.compare(a,b);
        System.out.print("\fResult: " + result);
        if(result > 0){
            System.out.print("\nFirst number is greater.");
        }
        else if (result < 0){
            System.out.print("\nSecond number is greater.");
        }
        else{
            System.out.print("\nBoth numbers are equal.");
        }
    }
}