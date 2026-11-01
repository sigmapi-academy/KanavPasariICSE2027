package BoxingAndUnBoxing;


/**
 * Write a description of class BoxingExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BoxingExample
{
    public static void main(String[] args){
        int a = 100;
        // Integer obj = Integer.valueOf(a);
        Integer obj = a;
        System.out.print("\fPrimitive value: " + a);
        System.out.print("\nWrapper object: " + obj);
        
        System.out.print("\nx = " + obj.decode("0x41"));
    }
}